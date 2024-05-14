package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanleixingView;


/**
 * 预案类型
 *
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
public interface YuanleixingService extends IService<YuanleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanleixingVO> selectListVO(Wrapper<YuanleixingEntity> wrapper);
   	
   	YuanleixingVO selectVO(@Param("ew") Wrapper<YuanleixingEntity> wrapper);
   	
   	List<YuanleixingView> selectListView(Wrapper<YuanleixingEntity> wrapper);
   	
   	YuanleixingView selectView(@Param("ew") Wrapper<YuanleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanleixingEntity> wrapper);
   	
}

