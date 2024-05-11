package com.entity.vo;

import com.entity.KeshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 科室信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-15 20:07:29
 */
public class KeshixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
