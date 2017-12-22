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

	@Autowired
    GoodsService goodsService; 

    @RequestMapping("/")
    public String index() {
    	logger.info("index...");
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list(Model model, 
    		@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
    	logger.info("list...");
    	PageHelper.startPage(pn, 10);
    	List<Goods> goods = goodsService.findAll();
    	for(Goods good : goods){
    		good.setCreateTimeStr(TimeUtils.formatIntToDateString(good.getCreateTime()));
    	}
    	System.out.println(goods.size());
		PageInfo pageInfo = new PageInfo(goods, 10);
		model.addAttribute("pageInfo", pageInfo);
        return "goods/list";
    }
    
    @RequestMapping("/print")
    public String print(Model model, 
    		@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
    	logger.info("list...");
    	PageHelper.startPage(pn, 10);
    	List<Goods> goods = goodsService.findAll();
		PageInfo pageInfo = new PageInfo(goods, 10);
		model.addAttribute("pageInfo", pageInfo);
        return "goods/print";
    }
    
    @RequestMapping("/toAdd")
    public String toAdd(Model model) {
        return "goods/add";
    }
    
    @RequestMapping("/toAdd2")
    public String toAdd2(Model model) {
        return "goods/add2";
    }
    
    @RequestMapping("/toEdit")
    public String toEdit(Model model, Long id) {
    	Goods goods = goodsService.findGoodsById(id);
        model.addAttribute("goods", goods);
        return "goods/edit";
    }

}
