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


import com.dao.DuiyingyuanDao;
import com.entity.DuiyingyuanEntity;
import com.service.DuiyingyuanService;
import com.entity.vo.DuiyingyuanVO;
import com.entity.view.DuiyingyuanView;

@Service("duiyingyuanService")
public class DuiyingyuanServiceImpl extends ServiceImpl<DuiyingyuanDao, DuiyingyuanEntity> implements DuiyingyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DuiyingyuanEntity> page = this.selectPage(
                new Query<DuiyingyuanEntity>(params).getPage(),
                new EntityWrapper<DuiyingyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DuiyingyuanEntity> wrapper) {
		  Page<DuiyingyuanView> page =new Query<DuiyingyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DuiyingyuanVO> selectListVO(Wrapper<DuiyingyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DuiyingyuanVO selectVO(Wrapper<DuiyingyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DuiyingyuanView> selectListView(Wrapper<DuiyingyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DuiyingyuanView selectView(Wrapper<DuiyingyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
