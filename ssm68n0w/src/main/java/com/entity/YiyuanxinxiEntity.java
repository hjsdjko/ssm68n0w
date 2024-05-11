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
 * 医院信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-15 20:07:29
 */
@TableName("yiyuanxinxi")
public class YiyuanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YiyuanxinxiEntity() {
		
	}
	
	public YiyuanxinxiEntity(T t) {
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
	 * 医院地址
	 */
					
	private String yiyuandizhi;
	
	/**
	 * 医院领导
	 */
					
	private String yiyuanlingdao;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 营业时间
	 */
					
	private String yingyeshijian;
	
	/**
	 * 医院等级
	 */
					
	private String yiyuandengji;
	
	/**
	 * 医院图片
	 */
					
	private String yiyuantupian;
	
	/**
	 * 医院简介
	 */
					
	private String yiyuanjianjie;
	
	
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
	 * 设置：医院地址
	 */
	public void setYiyuandizhi(String yiyuandizhi) {
		this.yiyuandizhi = yiyuandizhi;
	}
	/**
	 * 获取：医院地址
	 */
	public String getYiyuandizhi() {
		return yiyuandizhi;
	}
	/**
	 * 设置：医院领导
	 */
	public void setYiyuanlingdao(String yiyuanlingdao) {
		this.yiyuanlingdao = yiyuanlingdao;
	}
	/**
	 * 获取：医院领导
	 */
	public String getYiyuanlingdao() {
		return yiyuanlingdao;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：营业时间
	 */
	public void setYingyeshijian(String yingyeshijian) {
		this.yingyeshijian = yingyeshijian;
	}
	/**
	 * 获取：营业时间
	 */
	public String getYingyeshijian() {
		return yingyeshijian;
	}
	/**
	 * 设置：医院等级
	 */
	public void setYiyuandengji(String yiyuandengji) {
		this.yiyuandengji = yiyuandengji;
	}
	/**
	 * 获取：医院等级
	 */
	public String getYiyuandengji() {
		return yiyuandengji;
	}
	/**
	 * 设置：医院图片
	 */
	public void setYiyuantupian(String yiyuantupian) {
		this.yiyuantupian = yiyuantupian;
	}
	/**
	 * 获取：医院图片
	 */
	public String getYiyuantupian() {
		return yiyuantupian;
	}
	/**
	 * 设置：医院简介
	 */
	public void setYiyuanjianjie(String yiyuanjianjie) {
		this.yiyuanjianjie = yiyuanjianjie;
	}
	/**
	 * 获取：医院简介
	 */
	public String getYiyuanjianjie() {
		return yiyuanjianjie;
	}

}
