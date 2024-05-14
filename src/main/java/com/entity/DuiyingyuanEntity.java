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
 * 对应预案
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
@TableName("duiyingyuan")
public class DuiyingyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DuiyingyuanEntity() {
		
	}
	
	public DuiyingyuanEntity(T t) {
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjishijian;
	
	
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
