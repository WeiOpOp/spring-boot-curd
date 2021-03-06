package com.neo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neo.common.TimeUtils;
import com.neo.entity.Goods;
import com.neo.service.GoodsService;

@Controller
public class GoodsController extends BaseController{
	
	public static int pageSize = 10; 

	@Autowired
    GoodsService goodsService; 

    @RequestMapping("/")
    public String index() {
    	logger.info("index...");
        return "redirect:/list";
    }
    
    @RequestMapping("/list")
    public String list(Model model, 
    		@RequestParam(value = "pn", defaultValue = "1") Integer pn,
    		@RequestParam(value = "hotelName", defaultValue = "") String hotelName,
    		@RequestParam(value = "startTime", defaultValue = "") String startTime,
    		@RequestParam(value = "endTime", defaultValue = "") String endTime) {
    	logger.info("列表：" + hotelName + startTime + endTime);
    	PageHelper.startPage(pn, pageSize);
    	List<Goods> goods = goodsService.search(hotelName, startTime, endTime);
    	for(Goods good : goods){
    		good.setCreateTimeStr(TimeUtils.formatIntToDateString(good.getCreateTime()));
    	}
		PageInfo<Goods> pageInfo = new PageInfo<Goods>(goods, pageSize);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("createTimeStr", TimeUtils.getCurrentDate(null));
		model.addAttribute("hotelName",hotelName);
		model.addAttribute("startTime",startTime);
		model.addAttribute("endTime",endTime);
        return "goods/list";
    }
    
    @RequestMapping("/print")
    public String print(Model model, 
    		@RequestParam(value = "pn", defaultValue = "1") Integer pn,
    		@RequestParam(value = "hotelName", defaultValue = "") String hotelName,
    		@RequestParam(value = "startTime", defaultValue = "") String startTime,
    		@RequestParam(value = "endTime", defaultValue = "") String endTime) {
    	logger.info("打印：" + hotelName + startTime + endTime);
    	PageHelper.startPage(pn, pageSize);
    	List<Goods> goods = goodsService.search(hotelName, startTime, endTime);
    	for(Goods good : goods){
    		good.setCreateTimeStr(TimeUtils.formatIntToDateString(good.getCreateTime()));
    	}
		PageInfo<Goods> pageInfo = new PageInfo<Goods>(goods, pageSize);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("createTimeStr", TimeUtils.getCurrentDate(null));
		model.addAttribute("hotelName",hotelName);
		model.addAttribute("startTime",startTime);
		model.addAttribute("endTime",endTime);
        return "goods/print";
    }
    
    @RequestMapping("/toAdd")
    public String toAdd(Model model) {
    	model.addAttribute("createTimeStr", TimeUtils.getCurrentDate(null));
        return "goods/add";
    }
    
    @RequestMapping("/toAdd2")
    public String toAdd2(Model model) {
        return "goods/add2";
    }
    
    @RequestMapping("/toEdit")
    public String toEdit(Model model, Long id) {
    	Goods goods = goodsService.findGoodsById(id);
    	model.addAttribute("createTimeStr", TimeUtils.formatIntToDateString(goods.getCreateTime()));
        model.addAttribute("goods", goods);
        return "goods/edit";
    }

}
