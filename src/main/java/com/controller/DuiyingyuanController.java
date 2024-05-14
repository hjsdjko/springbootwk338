package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DuiyingyuanEntity;
import com.entity.view.DuiyingyuanView;

import com.service.DuiyingyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 对应预案
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
@RestController
@RequestMapping("/duiyingyuan")
public class DuiyingyuanController {
    @Autowired
    private DuiyingyuanService duiyingyuanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DuiyingyuanEntity duiyingyuan,
		HttpServletRequest request){
        EntityWrapper<DuiyingyuanEntity> ew = new EntityWrapper<DuiyingyuanEntity>();
		PageUtils page = duiyingyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, duiyingyuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DuiyingyuanEntity duiyingyuan, 
		HttpServletRequest request){
        EntityWrapper<DuiyingyuanEntity> ew = new EntityWrapper<DuiyingyuanEntity>();
		PageUtils page = duiyingyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, duiyingyuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DuiyingyuanEntity duiyingyuan){
       	EntityWrapper<DuiyingyuanEntity> ew = new EntityWrapper<DuiyingyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( duiyingyuan, "duiyingyuan")); 
        return R.ok().put("data", duiyingyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DuiyingyuanEntity duiyingyuan){
        EntityWrapper< DuiyingyuanEntity> ew = new EntityWrapper< DuiyingyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( duiyingyuan, "duiyingyuan")); 
		DuiyingyuanView duiyingyuanView =  duiyingyuanService.selectView(ew);
		return R.ok("查询对应预案成功").put("data", duiyingyuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DuiyingyuanEntity duiyingyuan = duiyingyuanService.selectById(id);
        return R.ok().put("data", duiyingyuan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DuiyingyuanEntity duiyingyuan = duiyingyuanService.selectById(id);
        return R.ok().put("data", duiyingyuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DuiyingyuanEntity duiyingyuan, HttpServletRequest request){
    	duiyingyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(duiyingyuan);
        duiyingyuanService.insert(duiyingyuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DuiyingyuanEntity duiyingyuan, HttpServletRequest request){
    	duiyingyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(duiyingyuan);
        duiyingyuanService.insert(duiyingyuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DuiyingyuanEntity duiyingyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(duiyingyuan);
        duiyingyuanService.updateById(duiyingyuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        duiyingyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DuiyingyuanEntity> wrapper = new EntityWrapper<DuiyingyuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = duiyingyuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
