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


import com.dao.YuanxinxiDao;
import com.entity.YuanxinxiEntity;
import com.service.YuanxinxiService;
import com.entity.vo.YuanxinxiVO;
import com.entity.view.YuanxinxiView;

@Service("yuanxinxiService")
public class YuanxinxiServiceImpl extends ServiceImpl<YuanxinxiDao, YuanxinxiEntity> implements YuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanxinxiEntity> page = this.selectPage(
                new Query<YuanxinxiEntity>(params).getPage(),
                new EntityWrapper<YuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanxinxiEntity> wrapper) {
		  Page<YuanxinxiView> page =new Query<YuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanxinxiVO> selectListVO(Wrapper<YuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanxinxiVO selectVO(Wrapper<YuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanxinxiView> selectListView(Wrapper<YuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanxinxiView selectView(Wrapper<YuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
