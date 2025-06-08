package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SituationEntity;
import java.util.Map;

/**
 * 上课情况 服务类
 * @author 
 * @since 2021-04-05
 */
public interface SituationService extends IService<SituationEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}