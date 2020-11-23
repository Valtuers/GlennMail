package com.glennmall.product.dao;

import com.glennmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Valtuers
 * @email 1581510541@qq.com
 * @date 2020-11-19 20:32:26
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
