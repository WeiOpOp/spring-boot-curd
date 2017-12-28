package com.neo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.common.TimeUtils;
import com.neo.entity.Goods;
import com.neo.entity.Msg;
import com.neo.service.GoodsService;

@RestController
public class GoodsRestController extends BaseController{
	@Autowired
    GoodsService goodsService; 
	
  	@RequestMapping("/save")
    public Msg save(Goods goods) {
		goods.setCreateTime(TimeUtils.formatDateStringToInt(goods.getCreateTimeStr()));
		goods.setPrice(getPrice(goods));
    	goodsService.insert(goods);
        return Msg.success();
    }
  	
    @RequestMapping("/update")
    public Msg update(Goods goods) {
    	if(goods != null && goods.getId() != null){
    		goods.setCreateTime(TimeUtils.formatDateStringToInt(goods.getCreateTimeStr()));
    		goods.setPrice(getPrice(goods));
    		goodsService.udpate(goods);
    		return Msg.success();
    	}else{
    		return Msg.fail();
    	}
    }

    @RequestMapping("/delete")
    public Msg delete(String ids) {
    	if(ids.contains("-")){
			List<Long> del_ids = new ArrayList<Long>();
			String[] str_ids = ids.split("-");
			//组装id的集合
			for (String string : str_ids) {
				del_ids.add(Long.parseLong(string));
			}
			goodsService.deleteBatch(del_ids);
			return Msg.success();
		}else{
			Long id = Long.parseLong(ids);
    		goodsService.deleteById(id);
    		return Msg.success();
		}
    		
    }
    
    private Double getPrice(Goods goods){
    	Double price = goods.getChuangdan() * goods.getChuangdanNum() +
				goods.getBeizhao() * goods.getBeizhaoNum() +
				goods.getZhenjin() * goods.getZhenjinNum() + 
				goods.getYujin() * goods.getYujinNum() +
				goods.getMianjin() * goods.getMianjinNum() +
				goods.getYupao() * goods.getYupaoNum() +
				goods.getChuanglian() * goods.getChuanglianNum() + 
				goods.getChuangsha() * goods.getChuangshaNum() + 
				goods.getHanzhengfu() * goods.getHanzhengfuNum() +
				goods.getTaibuDa() * goods.getTaibuDaNum() +
				goods.getTaibuXiao() * goods.getTaibuXiaoNum()
				;
    	logger.info(price);
		return price;
    	
    }
}
