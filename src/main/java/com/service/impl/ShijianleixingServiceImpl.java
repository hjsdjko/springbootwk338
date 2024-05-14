package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShijianleixingDao;
import com.entity.ShijianleixingEntity;
import com.service.ShijianleixingService;
import com.entity.vo.ShijianleixingVO;
import com.entity.view.ShijianleixingView;

@Service("shijianleixingService")
public class ShijianleixingServiceImpl extends ServiceImpl<ShijianleixingDao, ShijianleixingEntity> implements ShijianleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShijianleixingEntity> page = this.selectPage(
                new Query<ShijianleixingEntity>(params).getPage(),
                new EntityWrapper<ShijianleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShijianleixingEntity> wrapper) {
		  Page<ShijianleixingView> page =new Query<ShijianleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShijianleixingVO> selectListVO(Wrapper<ShijianleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShijianleixingVO selectVO(Wrapper<ShijianleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShijianleixingView> selectListView(Wrapper<ShijianleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShijianleixingView selectView(Wrapper<ShijianleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
