package com.dao;

import com.entity.ShijianleixingtongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShijianleixingtongjiVO;
import com.entity.view.ShijianleixingtongjiView;


/**
 * 事件类型统计
 * 
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
public interface ShijianleixingtongjiDao extends BaseMapper<ShijianleixingtongjiEntity> {
	
	List<ShijianleixingtongjiVO> selectListVO(@Param("ew") Wrapper<ShijianleixingtongjiEntity> wrapper);
	
	ShijianleixingtongjiVO selectVO(@Param("ew") Wrapper<ShijianleixingtongjiEntity> wrapper);
	
	List<ShijianleixingtongjiView> selectListView(@Param("ew") Wrapper<ShijianleixingtongjiEntity> wrapper);

	List<ShijianleixingtongjiView> selectListView(Pagination page,@Param("ew") Wrapper<ShijianleixingtongjiEntity> wrapper);
	
	ShijianleixingtongjiView selectView(@Param("ew") Wrapper<ShijianleixingtongjiEntity> wrapper);
	
}
