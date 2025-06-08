package com.entity.vo;

import com.entity.ZhengshuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学生证书
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-05
 */
@TableName("zhengshu")
public class ZhengshuVO implements Serializable {
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

    @TableField(value = "zhengshu_time")
    private Date zhengshuTime;


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

}
