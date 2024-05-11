package com.entity.vo;

import com.entity.YishengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 医生信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-15 20:07:29
 */
public class YishengxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医生编号
	 */
	
	private String yishengbianhao;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 职称
	 */
	
	private String zhicheng;
		
	/**
	 * 擅长
	 */
	
	private String shanzhang;
		
	/**
	 * 个人简介
	 */
	
	private String gerenjianjie;
				
	
	/**
	 * 设置：医生编号
	 */
	 
	public void setYishengbianhao(String yishengbianhao) {
		this.yishengbianhao = yishengbianhao;
	}
	
	/**
	 * 获取：医生编号
	 */
	public String getYishengbianhao() {
		return yishengbianhao;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：职称
	 */
	 
	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}
	
	/**
	 * 获取：职称
	 */
	public String getZhicheng() {
		return zhicheng;
	}
				
	
	/**
	 * 设置：擅长
	 */
	 
	public void setShanzhang(String shanzhang) {
		this.shanzhang = shanzhang;
	}
	
	/**
	 * 获取：擅长
	 */
	public String getShanzhang() {
		return shanzhang;
	}
				
	
	/**
	 * 设置：个人简介
	 */
	 
	public void setGerenjianjie(String gerenjianjie) {
		this.gerenjianjie = gerenjianjie;
	}
	
	/**
	 * 获取：个人简介
	 */
	public String getGerenjianjie() {
		return gerenjianjie;
	}
			
}
