package com.entity.view;

import com.entity.DuiyingyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 对应预案
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
@TableName("duiyingyuan")
public class DuiyingyuanView  extends DuiyingyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DuiyingyuanView(){
	}
 
 	public DuiyingyuanView(DuiyingyuanEntity duiyingyuanEntity){
 	try {
			BeanUtils.copyProperties(this, duiyingyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
