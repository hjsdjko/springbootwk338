package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShijianleixingtongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShijianleixingtongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShijianleixingtongjiView;


/**
 * 事件类型统计
 *
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
public interface ShijianleixingtongjiService extends IService<ShijianleixingtongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShijianleixingtongjiVO> selectListVO(Wrapper<ShijianleixingtongjiEntity> wrapper);
   	
   	ShijianleixingtongjiVO selectVO(@Param("ew") Wrapper<ShijianleixingtongjiEntity> wrapper);
   	
   	List<ShijianleixingtongjiView> selectListView(Wrapper<ShijianleixingtongjiEntity> wrapper);
   	
   	ShijianleixingtongjiView selectView(@Param("ew") Wrapper<ShijianleixingtongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShijianleixingtongjiEntity> wrapper);
   	
}

