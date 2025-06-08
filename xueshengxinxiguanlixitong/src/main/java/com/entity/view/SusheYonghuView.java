package com.entity.view;

import com.entity.SusheYonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 人员与宿舍关系
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-05
 */
@TableName("sushe_yonghu")
public class SusheYonghuView extends SusheYonghuEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 sushe
			/**
			* 楼栋
			*/
			private String building;
			/**
			* 单元
			*/
			private String unit;
			/**
			* 房间号
			*/
			private String room;
			/**
			* 已住人员
			*/
			private Integer susheNumber;

		//级联表 yonghu
			/**
			* 学号
			*/
			private String yonghuXuehao;
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 学生性别
			*/
			private Integer sexTypes;
				/**
				* 学生性别的值
				*/
				private String sexValue;
			/**
			* 学生身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 学生手机号
			*/
			private String yonghuPhone;
			/**
			* 班级
			*/
			private Integer banjiTypes;
				/**
				* 班级的值
				*/
				private String banjiValue;
			/**
			* 学生照片
			*/
			private String yonghuPhoto;

	public SusheYonghuView() {

	}

	public SusheYonghuView(SusheYonghuEntity susheYonghuEntity) {
		try {
			BeanUtils.copyProperties(this, susheYonghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

















				//级联表的get和set sushe
					/**
					* 获取： 楼栋
					*/
					public String getBuilding() {
						return building;
					}
					/**
					* 设置： 楼栋
					*/
					public void setBuilding(String building) {
						this.building = building;
					}
					/**
					* 获取： 单元
					*/
					public String getUnit() {
						return unit;
					}
					/**
					* 设置： 单元
					*/
					public void setUnit(String unit) {
						this.unit = unit;
					}
					/**
					* 获取： 房间号
					*/
					public String getRoom() {
						return room;
					}
					/**
					* 设置： 房间号
					*/
					public void setRoom(String room) {
						this.room = room;
					}
					/**
					* 获取： 已住人员
					*/
					public Integer getSusheNumber() {
						return susheNumber;
					}
					/**
					* 设置： 已住人员
					*/
					public void setSusheNumber(Integer susheNumber) {
						this.susheNumber = susheNumber;
					}





				//级联表的get和set yonghu
					/**
					* 获取： 学号
					*/
					public String getYonghuXuehao() {
						return yonghuXuehao;
					}
					/**
					* 设置： 学号
					*/
					public void setYonghuXuehao(String yonghuXuehao) {
						this.yonghuXuehao = yonghuXuehao;
					}
					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 学生性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 学生性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 学生性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 学生性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 学生身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 学生手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 学生手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 班级
					*/
					public Integer getBanjiTypes() {
						return banjiTypes;
					}
					/**
					* 设置： 班级
					*/
					public void setBanjiTypes(Integer banjiTypes) {
						this.banjiTypes = banjiTypes;
					}


						/**
						* 获取： 班级的值
						*/
						public String getBanjiValue() {
							return banjiValue;
						}
						/**
						* 设置： 班级的值
						*/
						public void setBanjiValue(String banjiValue) {
							this.banjiValue = banjiValue;
						}
					/**
					* 获取： 学生照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 学生照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}







}
