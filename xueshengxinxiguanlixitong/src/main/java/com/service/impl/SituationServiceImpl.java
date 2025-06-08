package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.SituationDao;
import com.entity.SituationEntity;
import com.service.SituationService;
import com.entity.view.SituationView;

/**
 * 上课情况 服务实现类
 * @author 
 * @since 2021-04-05
 */
@Service("situationService")
@Transactional
public class SituationServiceImpl extends ServiceImpl<SituationDao, SituationEntity> implements SituationService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<SituationView> page =new Query<SituationView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
