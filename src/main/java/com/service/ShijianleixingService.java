package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShijianleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShijianleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShijianleixingView;


/**
 * 事件类型
 *
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
public interface ShijianleixingService extends IService<ShijianleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShijianleixingVO> selectListVO(Wrapper<ShijianleixingEntity> wrapper);
   	
   	ShijianleixingVO selectVO(@Param("ew") Wrapper<ShijianleixingEntity> wrapper);
   	
   	List<ShijianleixingView> selectListView(Wrapper<ShijianleixingEntity> wrapper);
   	
   	ShijianleixingView selectView(@Param("ew") Wrapper<ShijianleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShijianleixingEntity> wrapper);
   	
}

