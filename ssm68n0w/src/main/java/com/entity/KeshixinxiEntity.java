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
 * 科室信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-15 20:07:29
 */
@TableName("keshixinxi")
public class KeshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KeshixinxiEntity() {
		
	}
	
	public KeshixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 医院名称
	 */
					
	private String yiyuanmingcheng;
	
	/**
	 * 科室号
	 */
					
	private String keshihao;
	
	/**
	 * 科室名称
	 */
					
	private String keshimingcheng;
	
	/**
	 * 医生姓名
	 */
					
	private String yishengxingming;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 挂号费
	 */
					
	private Float guahaofei;
	
	/**
	 * 排班表
	 */
					
	private String paibanbiao;
	
	/**
	 * 科室介绍
	 */
					
	private String keshijieshao;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：医院名称
	 */
	public void setYiyuanmingcheng(String yiyuanmingcheng) {
		this.yiyuanmingcheng = yiyuanmingcheng;
	}
	/**
	 * 获取：医院名称
	 */
	public String getYiyuanmingcheng() {
		return yiyuanmingcheng;
	}
	/**
	 * 设置：科室号
	 */
	public void setKeshihao(String keshihao) {
		this.keshihao = keshihao;
	}
	/**
	 * 获取：科室号
	 */
	public String getKeshihao() {
		return keshihao;
	}
	/**
	 * 设置：科室名称
	 */
	public void setKeshimingcheng(String keshimingcheng) {
		this.keshimingcheng = keshimingcheng;
	}
	/**
	 * 获取：科室名称
	 */
	public String getKeshimingcheng() {
		return keshimingcheng;
	}
	/**
	 * 设置：医生姓名
	 */
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：挂号费
	 */
	public void setGuahaofei(Float guahaofei) {
		this.guahaofei = guahaofei;
	}
	/**
	 * 获取：挂号费
	 */
	public Float getGuahaofei() {
		return guahaofei;
	}
	/**
	 * 设置：排班表
	 */
	public void setPaibanbiao(String paibanbiao) {
		this.paibanbiao = paibanbiao;
	}
	/**
	 * 获取：排班表
	 */
	public String getPaibanbiao() {
		return paibanbiao;
	}
	/**
	 * 设置：科室介绍
	 */
	public void setKeshijieshao(String keshijieshao) {
		this.keshijieshao = keshijieshao;
	}
	/**
	 * 获取：科室介绍
	 */
	public String getKeshijieshao() {
		return keshijieshao;
	}

}
