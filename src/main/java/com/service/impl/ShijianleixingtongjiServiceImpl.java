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


import com.dao.ShijianleixingtongjiDao;
import com.entity.ShijianleixingtongjiEntity;
import com.service.ShijianleixingtongjiService;
import com.entity.vo.ShijianleixingtongjiVO;
import com.entity.view.ShijianleixingtongjiView;

@Service("shijianleixingtongjiService")
public class ShijianleixingtongjiServiceImpl extends ServiceImpl<ShijianleixingtongjiDao, ShijianleixingtongjiEntity> implements ShijianleixingtongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShijianleixingtongjiEntity> page = this.selectPage(
                new Query<ShijianleixingtongjiEntity>(params).getPage(),
                new EntityWrapper<ShijianleixingtongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShijianleixingtongjiEntity> wrapper) {
		  Page<ShijianleixingtongjiView> page =new Query<ShijianleixingtongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShijianleixingtongjiVO> selectListVO(Wrapper<ShijianleixingtongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShijianleixingtongjiVO selectVO(Wrapper<ShijianleixingtongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShijianleixingtongjiView> selectListView(Wrapper<ShijianleixingtongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShijianleixingtongjiView selectView(Wrapper<ShijianleixingtongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
