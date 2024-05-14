package com.entity.view;

import com.entity.YuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预案信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
@TableName("yuanxinxi")
public class YuanxinxiView  extends YuanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanxinxiView(){
	}
 
 	public YuanxinxiView(YuanxinxiEntity yuanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yuanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
