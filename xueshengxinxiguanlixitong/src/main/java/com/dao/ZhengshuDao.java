package com.dao;

import com.entity.ZhengshuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhengshuView;

/**
 * 学生证书 Dao 接口
 *
 * @author 
 * @since 2021-04-05
 */
public interface ZhengshuDao extends BaseMapper<ZhengshuEntity> {

   List<ZhengshuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
