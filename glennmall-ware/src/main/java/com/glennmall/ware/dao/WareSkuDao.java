package com.glennmall.ware.dao;

import com.glennmall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author Valtuers
 * @email 1581510541@qq.com
 * @date 2020-11-20 09:54:00
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
