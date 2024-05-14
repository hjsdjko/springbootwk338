package com.entity.vo;

import com.entity.DuiyingyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 对应预案
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
public class DuiyingyuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 受灾类型
	 */
	
	private String shouzaileixing;
		
	/**
	 * 受灾范围
	 */
	
	private String shouzaifanwei;
		
	/**
	 * 受灾时间
	 */
	
	private String shouzaishijian;
		
	/**
	 * 受灾人员数目
	 */
	
	private Integer shouzairenyuanshumu;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
				
	
	/**
	 * 设置：受灾类型
	 */
	 
	public void setShouzaileixing(String shouzaileixing) {
		this.shouzaileixing = shouzaileixing;
	}
	
	/**
	 * 获取：受灾类型
	 */
	public String getShouzaileixing() {
		return shouzaileixing;
	}
				
	
	/**
	 * 设置：受灾范围
	 */
	 
	public void setShouzaifanwei(String shouzaifanwei) {
		this.shouzaifanwei = shouzaifanwei;
	}
	
	/**
	 * 获取：受灾范围
	 */
	public String getShouzaifanwei() {
		return shouzaifanwei;
	}
				
	
	/**
	 * 设置：受灾时间
	 */
	 
	public void setShouzaishijian(String shouzaishijian) {
		this.shouzaishijian = shouzaishijian;
	}
	
	/**
	 * 获取：受灾时间
	 */
	public String getShouzaishijian() {
		return shouzaishijian;
	}
				
	
	/**
	 * 设置：受灾人员数目
	 */
	 
	public void setShouzairenyuanshumu(Integer shouzairenyuanshumu) {
		this.shouzairenyuanshumu = shouzairenyuanshumu;
	}
	
	/**
	 * 获取：受灾人员数目
	 */
	public Integer getShouzairenyuanshumu() {
		return shouzairenyuanshumu;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
			
}
