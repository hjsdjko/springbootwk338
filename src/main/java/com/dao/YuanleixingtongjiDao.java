package com.dao;

import com.entity.YuanleixingtongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanleixingtongjiVO;
import com.entity.view.YuanleixingtongjiView;


/**
 * 预案类型统计
 * 
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
public interface YuanleixingtongjiDao extends BaseMapper<YuanleixingtongjiEntity> {
	
	List<YuanleixingtongjiVO> selectListVO(@Param("ew") Wrapper<YuanleixingtongjiEntity> wrapper);
	
	YuanleixingtongjiVO selectVO(@Param("ew") Wrapper<YuanleixingtongjiEntity> wrapper);
	
	List<YuanleixingtongjiView> selectListView(@Param("ew") Wrapper<YuanleixingtongjiEntity> wrapper);

	List<YuanleixingtongjiView> selectListView(Pagination page,@Param("ew") Wrapper<YuanleixingtongjiEntity> wrapper);
	
	YuanleixingtongjiView selectView(@Param("ew") Wrapper<YuanleixingtongjiEntity> wrapper);
	
}
