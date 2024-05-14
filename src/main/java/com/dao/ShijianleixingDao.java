package com.dao;

import com.entity.ShijianleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShijianleixingVO;
import com.entity.view.ShijianleixingView;


/**
 * 事件类型
 * 
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
public interface ShijianleixingDao extends BaseMapper<ShijianleixingEntity> {
	
	List<ShijianleixingVO> selectListVO(@Param("ew") Wrapper<ShijianleixingEntity> wrapper);
	
	ShijianleixingVO selectVO(@Param("ew") Wrapper<ShijianleixingEntity> wrapper);
	
	List<ShijianleixingView> selectListView(@Param("ew") Wrapper<ShijianleixingEntity> wrapper);

	List<ShijianleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ShijianleixingEntity> wrapper);
	
	ShijianleixingView selectView(@Param("ew") Wrapper<ShijianleixingEntity> wrapper);
	
}
