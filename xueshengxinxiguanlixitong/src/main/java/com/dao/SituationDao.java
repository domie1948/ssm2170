package com.dao;

import com.entity.SituationEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.SituationView;

/**
 * 上课情况 Dao 接口
 *
 * @author 
 * @since 2021-04-05
 */
public interface SituationDao extends BaseMapper<SituationEntity> {

   List<SituationView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
