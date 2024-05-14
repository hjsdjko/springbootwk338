package com.entity.view;

import com.entity.ShijianleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 事件类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
@TableName("shijianleixing")
public class ShijianleixingView  extends ShijianleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShijianleixingView(){
	}
 
 	public ShijianleixingView(ShijianleixingEntity shijianleixingEntity){
 	try {
			BeanUtils.copyProperties(this, shijianleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
