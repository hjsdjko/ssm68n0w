package com.entity.vo;

import com.entity.YiyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 医院信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-15 20:07:29
 */
public class YiyuanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
