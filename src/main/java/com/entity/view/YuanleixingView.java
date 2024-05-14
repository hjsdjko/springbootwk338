package com.entity.view;

import com.entity.YuanleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预案类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
@TableName("yuanleixing")
public class YuanleixingView  extends YuanleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanleixingView(){
	}
 
 	public YuanleixingView(YuanleixingEntity yuanleixingEntity){
 	try {
			BeanUtils.copyProperties(this, yuanleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
