package com.entity.view;

import com.entity.SituationEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 上课情况
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-05
 */
@TableName("situation")
public class SituationView extends SituationEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 上课情况的值
		*/
		private String situationValue;



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

	public SituationView() {

	}

	public SituationView(SituationEntity situationEntity) {
		try {
			BeanUtils.copyProperties(this, situationEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 上课情况的值
			*/
			public String getSituationValue() {
				return situationValue;
			}
			/**
			* 设置： 上课情况的值
			*/
			public void setSituationValue(String situationValue) {
				this.situationValue = situationValue;
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
