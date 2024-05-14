package com.dao;

import com.entity.DuiyingyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DuiyingyuanVO;
import com.entity.view.DuiyingyuanView;


/**
 * 对应预案
 * 
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
public interface DuiyingyuanDao extends BaseMapper<DuiyingyuanEntity> {
	
	List<DuiyingyuanVO> selectListVO(@Param("ew") Wrapper<DuiyingyuanEntity> wrapper);
	
	DuiyingyuanVO selectVO(@Param("ew") Wrapper<DuiyingyuanEntity> wrapper);
	
	List<DuiyingyuanView> selectListView(@Param("ew") Wrapper<DuiyingyuanEntity> wrapper);

	List<DuiyingyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DuiyingyuanEntity> wrapper);
	
	DuiyingyuanView selectView(@Param("ew") Wrapper<DuiyingyuanEntity> wrapper);
	
}
