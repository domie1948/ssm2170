package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 上课情况
 *
 * @author 
 * @email
 * @date 2021-04-05
 */
@TableName("situation")
public class SituationEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public SituationEntity() {

	}

	public SituationEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy")
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Situation{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", situationTypes=" + situationTypes +
            ", situationTime=" + situationTime +
            ", xueqi=" + xueqi +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
