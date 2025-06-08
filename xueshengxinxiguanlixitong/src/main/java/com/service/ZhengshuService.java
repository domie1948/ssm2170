package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhengshuEntity;
import java.util.Map;

/**
 * 学生证书 服务类
 * @author 
 * @since 2021-04-05
 */
public interface ZhengshuService extends IService<ZhengshuEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}