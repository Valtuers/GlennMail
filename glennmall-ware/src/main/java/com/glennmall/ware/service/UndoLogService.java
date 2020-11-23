package com.glennmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.glennmall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author Valtuers
 * @email 1581510541@qq.com
 * @date 2020-11-20 09:54:00
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

