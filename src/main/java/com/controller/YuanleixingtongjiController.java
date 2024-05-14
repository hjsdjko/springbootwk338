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

import com.entity.YuanleixingtongjiEntity;
import com.entity.view.YuanleixingtongjiView;

import com.service.YuanleixingtongjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 预案类型统计
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
@RestController
@RequestMapping("/yuanleixingtongji")
public class YuanleixingtongjiController {
    @Autowired
    private YuanleixingtongjiService yuanleixingtongjiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuanleixingtongjiEntity yuanleixingtongji,
		HttpServletRequest request){
        EntityWrapper<YuanleixingtongjiEntity> ew = new EntityWrapper<YuanleixingtongjiEntity>();
		PageUtils page = yuanleixingtongjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuanleixingtongji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuanleixingtongjiEntity yuanleixingtongji, 
		HttpServletRequest request){
        EntityWrapper<YuanleixingtongjiEntity> ew = new EntityWrapper<YuanleixingtongjiEntity>();
		PageUtils page = yuanleixingtongjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuanleixingtongji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuanleixingtongjiEntity yuanleixingtongji){
       	EntityWrapper<YuanleixingtongjiEntity> ew = new EntityWrapper<YuanleixingtongjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuanleixingtongji, "yuanleixingtongji")); 
        return R.ok().put("data", yuanleixingtongjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuanleixingtongjiEntity yuanleixingtongji){
        EntityWrapper< YuanleixingtongjiEntity> ew = new EntityWrapper< YuanleixingtongjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuanleixingtongji, "yuanleixingtongji")); 
		YuanleixingtongjiView yuanleixingtongjiView =  yuanleixingtongjiService.selectView(ew);
		return R.ok("查询预案类型统计成功").put("data", yuanleixingtongjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuanleixingtongjiEntity yuanleixingtongji = yuanleixingtongjiService.selectById(id);
        return R.ok().put("data", yuanleixingtongji);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuanleixingtongjiEntity yuanleixingtongji = yuanleixingtongjiService.selectById(id);
        return R.ok().put("data", yuanleixingtongji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuanleixingtongjiEntity yuanleixingtongji, HttpServletRequest request){
    	yuanleixingtongji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuanleixingtongji);
        yuanleixingtongjiService.insert(yuanleixingtongji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YuanleixingtongjiEntity yuanleixingtongji, HttpServletRequest request){
    	yuanleixingtongji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuanleixingtongji);
        yuanleixingtongjiService.insert(yuanleixingtongji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YuanleixingtongjiEntity yuanleixingtongji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuanleixingtongji);
        yuanleixingtongjiService.updateById(yuanleixingtongji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuanleixingtongjiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YuanleixingtongjiEntity> wrapper = new EntityWrapper<YuanleixingtongjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yuanleixingtongjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
