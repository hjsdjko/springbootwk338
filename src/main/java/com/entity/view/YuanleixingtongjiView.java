package com.entity.view;

import com.entity.YuanleixingtongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预案类型统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
@TableName("yuanleixingtongji")
public class YuanleixingtongjiView  extends YuanleixingtongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanleixingtongjiView(){
	}
 
 	public YuanleixingtongjiView(YuanleixingtongjiEntity yuanleixingtongjiEntity){
 	try {
			BeanUtils.copyProperties(this, yuanleixingtongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
