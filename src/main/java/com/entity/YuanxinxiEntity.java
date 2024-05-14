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
 * 预案信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
@TableName("yuanxinxi")
public class YuanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuanxinxiEntity() {
		
	}
	
	public YuanxinxiEntity(T t) {
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
	 * 预案名称
	 */
					
	private String yuanmingcheng;
	
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
	 * 设置：预案名称
	 */
	public void setYuanmingcheng(String yuanmingcheng) {
		this.yuanmingcheng = yuanmingcheng;
	}
	/**
	 * 获取：预案名称
	 */
	public String getYuanmingcheng() {
		return yuanmingcheng;
	}
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
