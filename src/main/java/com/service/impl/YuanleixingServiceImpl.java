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


import com.dao.YuanleixingDao;
import com.entity.YuanleixingEntity;
import com.service.YuanleixingService;
import com.entity.vo.YuanleixingVO;
import com.entity.view.YuanleixingView;

@Service("yuanleixingService")
public class YuanleixingServiceImpl extends ServiceImpl<YuanleixingDao, YuanleixingEntity> implements YuanleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanleixingEntity> page = this.selectPage(
                new Query<YuanleixingEntity>(params).getPage(),
                new EntityWrapper<YuanleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanleixingEntity> wrapper) {
		  Page<YuanleixingView> page =new Query<YuanleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanleixingVO> selectListVO(Wrapper<YuanleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanleixingVO selectVO(Wrapper<YuanleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanleixingView> selectListView(Wrapper<YuanleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanleixingView selectView(Wrapper<YuanleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
