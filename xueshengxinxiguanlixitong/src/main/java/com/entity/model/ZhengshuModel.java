package com.entity.model;

import com.entity.ZhengshuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学生证书
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-05
 */
public class ZhengshuModel implements Serializable {
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
     * 证书名
     */
    private String zhengshuName;


    /**
     * 证书类型
     */
    private Integer zhengshuTypes;


    /**
     * 获取证书时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date zhengshuTime;


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
	 * 获取：证书名
	 */
    public String getZhengshuName() {
        return zhengshuName;
    }


    /**
	 * 设置：证书名
	 */
    public void setZhengshuName(String zhengshuName) {
        this.zhengshuName = zhengshuName;
    }
    /**
	 * 获取：证书类型
	 */
    public Integer getZhengshuTypes() {
        return zhengshuTypes;
    }


    /**
	 * 设置：证书类型
	 */
    public void setZhengshuTypes(Integer zhengshuTypes) {
        this.zhengshuTypes = zhengshuTypes;
    }
    /**
	 * 获取：获取证书时间
	 */
    public Date getZhengshuTime() {
        return zhengshuTime;
    }


    /**
	 * 设置：获取证书时间
	 */
    public void setZhengshuTime(Date zhengshuTime) {
        this.zhengshuTime = zhengshuTime;
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
