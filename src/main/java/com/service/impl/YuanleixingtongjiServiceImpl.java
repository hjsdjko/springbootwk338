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


import com.dao.YuanleixingtongjiDao;
import com.entity.YuanleixingtongjiEntity;
import com.service.YuanleixingtongjiService;
import com.entity.vo.YuanleixingtongjiVO;
import com.entity.view.YuanleixingtongjiView;

@Service("yuanleixingtongjiService")
public class YuanleixingtongjiServiceImpl extends ServiceImpl<YuanleixingtongjiDao, YuanleixingtongjiEntity> implements YuanleixingtongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanleixingtongjiEntity> page = this.selectPage(
                new Query<YuanleixingtongjiEntity>(params).getPage(),
                new EntityWrapper<YuanleixingtongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanleixingtongjiEntity> wrapper) {
		  Page<YuanleixingtongjiView> page =new Query<YuanleixingtongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanleixingtongjiVO> selectListVO(Wrapper<YuanleixingtongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanleixingtongjiVO selectVO(Wrapper<YuanleixingtongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanleixingtongjiView> selectListView(Wrapper<YuanleixingtongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanleixingtongjiView selectView(Wrapper<YuanleixingtongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
