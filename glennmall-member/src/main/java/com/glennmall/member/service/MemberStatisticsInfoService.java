package com.glennmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.glennmall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 
 *
 * @author Valtuers
 * @email 1581510541@qq.com
 * @date 2020-11-20 09:10:58
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

