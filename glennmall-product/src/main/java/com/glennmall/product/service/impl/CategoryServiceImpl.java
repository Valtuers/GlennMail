package com.glennmall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.common.utils.PageUtils;
import com.common.utils.Query;

import com.glennmall.product.dao.CategoryDao;
import com.glennmall.product.entity.CategoryEntity;
import com.glennmall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> categoryList = baseMapper.selectList(null);

        List<CategoryEntity> level1Menus = categoryList.stream().filter(new Predicate<CategoryEntity>() {
            //过滤要找的菜单
            @Override
            public boolean test(CategoryEntity categoryEntity) {
                return categoryEntity.getParentCid() == 0;
            }
        }).map(new Function<CategoryEntity, CategoryEntity>() {
            //对找到的菜单进行操作
            @Override
            public CategoryEntity apply(CategoryEntity menu) {
                menu.setChildren(getChildren(menu,categoryList));
                return menu;
            }
        }).sorted(new Comparator<CategoryEntity>() {
            //对菜单进行排序
            @Override
            public int compare(CategoryEntity o1, CategoryEntity o2) {
                return o1.getSort() - o2.getSort();
            }
        }).collect(Collectors.toList());//把收集到的菜单放进List里
        return level1Menus;
    }

    @Override
    public void removeCategoryByIds(List<Long> asList) {
        //TODO 1、检查该分类下是否有商品
        baseMapper.deleteBatchIds(asList);
    }


    //递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildren(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> childrenList = all.stream().filter(new Predicate<CategoryEntity>() {
            @Override
            public boolean test(CategoryEntity categoryEntity) {
                return categoryEntity.getParentCid().equals(root.getCatId());
            }
        }).map(new Function<CategoryEntity, CategoryEntity>() {
            @Override
            public CategoryEntity apply(CategoryEntity categoryEntity) {
                categoryEntity.setChildren(getChildren(categoryEntity,all));
                return categoryEntity;
            }
        }).sorted(new Comparator<CategoryEntity>() {
            @Override
            public int compare(CategoryEntity o1, CategoryEntity o2) {
                return o1.getSort() - o2.getSort();
            }
        }).collect(Collectors.toList());
        return childrenList;
    }

}