package com.glennmall.order.dao;

import com.glennmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author Valtuers
 * @email 1581510541@qq.com
 * @date 2020-11-20 09:44:57
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
