package com.entity.model;

import com.entity.YuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 预案信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
public class YuanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 预案类型
	 */
	
	private String yuanleixing;
		
	/**
	 * 事件类型
	 */
	
	private String shijianleixing;
		
	/**
	 * 处理部门
	 */
	
	private String chulibumen;
		
	/**
	 * 预案文本
	 */
	
	private String yuanwenben;
				
	
	/**
	 * 设置：预案类型
	 */
	 
	public void setYuanleixing(String yuanleixing) {
		this.yuanleixing = yuanleixing;
	}
	
	/**
	 * 获取：预案类型
	 */
	public String getYuanleixing() {
		return yuanleixing;
	}
				
	
	/**
	 * 设置：事件类型
	 */
	 
	public void setShijianleixing(String shijianleixing) {
		this.shijianleixing = shijianleixing;
	}
	
	/**
	 * 获取：事件类型
	 */
	public String getShijianleixing() {
		return shijianleixing;
	}
				
	
	/**
	 * 设置：处理部门
	 */
	 
	public void setChulibumen(String chulibumen) {
		this.chulibumen = chulibumen;
	}
	
	/**
	 * 获取：处理部门
	 */
	public String getChulibumen() {
		return chulibumen;
	}
				
	
	/**
	 * 设置：预案文本
	 */
	 
	public void setYuanwenben(String yuanwenben) {
		this.yuanwenben = yuanwenben;
	}
	
	/**
	 * 获取：预案文本
	 */
	public String getYuanwenben() {
		return yuanwenben;
	}
			
}
