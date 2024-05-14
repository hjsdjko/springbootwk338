package com.dao;

import com.entity.YuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanxinxiVO;
import com.entity.view.YuanxinxiView;


/**
 * 预案信息
 * 
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
public interface YuanxinxiDao extends BaseMapper<YuanxinxiEntity> {
	
	List<YuanxinxiVO> selectListVO(@Param("ew") Wrapper<YuanxinxiEntity> wrapper);
	
	YuanxinxiVO selectVO(@Param("ew") Wrapper<YuanxinxiEntity> wrapper);
	
	List<YuanxinxiView> selectListView(@Param("ew") Wrapper<YuanxinxiEntity> wrapper);

	List<YuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YuanxinxiEntity> wrapper);
	
	YuanxinxiView selectView(@Param("ew") Wrapper<YuanxinxiEntity> wrapper);
	
}
