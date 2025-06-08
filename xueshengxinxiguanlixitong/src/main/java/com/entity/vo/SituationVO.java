package com.entity.vo;

import com.entity.SituationEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 上课情况
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-05
 */
@TableName("situation")
public class SituationVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户id
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 上课情况
     */

    @TableField(value = "situation_types")
    private Integer situationTypes;


    /**
     * 年份
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "situation_time")
    private Date situationTime;


    /**
     * 学期
     */

    @TableField(value = "xueqi")
    private String xueqi;


    /**
     * 填写时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户id
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户id
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：上课情况
	 */
    public Integer getSituationTypes() {
        return situationTypes;
    }


    /**
	 * 获取：上课情况
	 */

    public void setSituationTypes(Integer situationTypes) {
        this.situationTypes = situationTypes;
    }
    /**
	 * 设置：年份
	 */
    public Date getSituationTime() {
        return situationTime;
    }


    /**
	 * 获取：年份
	 */

    public void setSituationTime(Date situationTime) {
        this.situationTime = situationTime;
    }
    /**
	 * 设置：学期
	 */
    public String getXueqi() {
        return xueqi;
    }


    /**
	 * 获取：学期
	 */

    public void setXueqi(String xueqi) {
        this.xueqi = xueqi;
    }
    /**
	 * 设置：填写时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：填写时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
