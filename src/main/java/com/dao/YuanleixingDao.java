package com.dao;

import com.entity.YuanleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanleixingVO;
import com.entity.view.YuanleixingView;


/**
 * 预案类型
 * 
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
public interface YuanleixingDao extends BaseMapper<YuanleixingEntity> {
	
	List<YuanleixingVO> selectListVO(@Param("ew") Wrapper<YuanleixingEntity> wrapper);
	
	YuanleixingVO selectVO(@Param("ew") Wrapper<YuanleixingEntity> wrapper);
	
	List<YuanleixingView> selectListView(@Param("ew") Wrapper<YuanleixingEntity> wrapper);

	List<YuanleixingView> selectListView(Pagination page,@Param("ew") Wrapper<YuanleixingEntity> wrapper);
	
	YuanleixingView selectView(@Param("ew") Wrapper<YuanleixingEntity> wrapper);
	
}
