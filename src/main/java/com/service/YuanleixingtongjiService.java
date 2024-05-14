package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanleixingtongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanleixingtongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanleixingtongjiView;


/**
 * 预案类型统计
 *
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
public interface YuanleixingtongjiService extends IService<YuanleixingtongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanleixingtongjiVO> selectListVO(Wrapper<YuanleixingtongjiEntity> wrapper);
   	
   	YuanleixingtongjiVO selectVO(@Param("ew") Wrapper<YuanleixingtongjiEntity> wrapper);
   	
   	List<YuanleixingtongjiView> selectListView(Wrapper<YuanleixingtongjiEntity> wrapper);
   	
   	YuanleixingtongjiView selectView(@Param("ew") Wrapper<YuanleixingtongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanleixingtongjiEntity> wrapper);
   	
}

