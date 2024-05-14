package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DuiyingyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DuiyingyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DuiyingyuanView;


/**
 * 对应预案
 *
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
public interface DuiyingyuanService extends IService<DuiyingyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DuiyingyuanVO> selectListVO(Wrapper<DuiyingyuanEntity> wrapper);
   	
   	DuiyingyuanVO selectVO(@Param("ew") Wrapper<DuiyingyuanEntity> wrapper);
   	
   	List<DuiyingyuanView> selectListView(Wrapper<DuiyingyuanEntity> wrapper);
   	
   	DuiyingyuanView selectView(@Param("ew") Wrapper<DuiyingyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DuiyingyuanEntity> wrapper);
   	
}

