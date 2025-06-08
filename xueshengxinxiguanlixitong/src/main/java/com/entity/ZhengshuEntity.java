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
 * 学生证书
 *
 * @author 
 * @email
 * @date 2021-04-05
 */
@TableName("zhengshu")
public class ZhengshuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhengshuEntity() {

	}

	public ZhengshuEntity(T t) {
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
     * 证书名
     */
    @TableField(value = "zhengshu_name")

    private String zhengshuName;


    /**
     * 证书类型
     */
    @TableField(value = "zhengshu_types")

    private Integer zhengshuTypes;


    /**
     * 获取证书时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "zhengshu_time",fill = FieldFill.UPDATE)

    private Date zhengshuTime;


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
	 * 设置：证书名
	 */
    public String getZhengshuName() {
        return zhengshuName;
    }


    /**
	 * 获取：证书名
	 */

    public void setZhengshuName(String zhengshuName) {
        this.zhengshuName = zhengshuName;
    }
    /**
	 * 设置：证书类型
	 */
    public Integer getZhengshuTypes() {
        return zhengshuTypes;
    }


    /**
	 * 获取：证书类型
	 */

    public void setZhengshuTypes(Integer zhengshuTypes) {
        this.zhengshuTypes = zhengshuTypes;
    }
    /**
	 * 设置：获取证书时间
	 */
    public Date getZhengshuTime() {
        return zhengshuTime;
    }


    /**
	 * 获取：获取证书时间
	 */

    public void setZhengshuTime(Date zhengshuTime) {
        this.zhengshuTime = zhengshuTime;
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
        return "Zhengshu{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", zhengshuName=" + zhengshuName +
            ", zhengshuTypes=" + zhengshuTypes +
            ", zhengshuTime=" + zhengshuTime +
            ", createTime=" + createTime +
        "}";
    }
}
