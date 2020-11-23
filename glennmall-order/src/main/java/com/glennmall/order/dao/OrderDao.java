package com.glennmall.order.dao;

import com.glennmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Valtuers
 * @email 1581510541@qq.com
 * @date 2020-11-20 09:44:57
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
