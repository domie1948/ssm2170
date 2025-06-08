package com.entity.model;

import com.entity.SituationEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 上课情况
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-05
 */
public class SituationModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户id
     */
    private Integer yonghuId;


    /**
     * 上课情况
     */
    private Integer situationTypes;


    /**
     * 年份
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date situationTime;


    /**
     * 学期
     */
    private String xueqi;


    /**
     * 填写时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户id
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户id
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：上课情况
	 */
    public Integer getSituationTypes() {
        return situationTypes;
    }


    /**
	 * 设置：上课情况
	 */
    public void setSituationTypes(Integer situationTypes) {
        this.situationTypes = situationTypes;
    }
    /**
	 * 获取：年份
	 */
    public Date getSituationTime() {
        return situationTime;
    }


    /**
	 * 设置：年份
	 */
    public void setSituationTime(Date situationTime) {
        this.situationTime = situationTime;
    }
    /**
	 * 获取：学期
	 */
    public String getXueqi() {
        return xueqi;
    }


    /**
	 * 设置：学期
	 */
    public void setXueqi(String xueqi) {
        this.xueqi = xueqi;
    }
    /**
	 * 获取：填写时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：填写时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
