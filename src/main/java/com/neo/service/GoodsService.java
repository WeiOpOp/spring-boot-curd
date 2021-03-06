package com.neo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.common.TimeUtils;
import com.neo.entity.Goods;
import com.neo.entity.GoodsExample;
import com.neo.entity.GoodsExample.Criteria;
import com.neo.mapper.GoodsMapper;
@Service
public class GoodsService {
	@Autowired
	GoodsMapper goodsMapper;
	
	public List<Goods> findAll() {
		return goodsMapper.findAll();
	}
	
	public Goods findGoodsById(Long id) {
		return goodsMapper.selectByPrimaryKey(id);
	}
	
	public int insert(Goods goods) {
		return goodsMapper.insert(goods);
	}
	
	public int deleteById(Long id) {
		return goodsMapper.deleteByPrimaryKey(id);
	}
	
	public void deleteBatch(List<Long> ids) {
		GoodsExample example = new GoodsExample();
		Criteria criteria = example.createCriteria();
		//delete from xxx where emp_id in(1,2,3)
		criteria.andIdIn(ids);
		goodsMapper.deleteByExample(example);
	}
	
	public List<Goods> search(String hotelName, String startTime, String endTime) {
		GoodsExample example = new GoodsExample();
		Criteria criteria = example.createCriteria();
		if(!"".equals(hotelName)){
			criteria.andHotelNameEqualTo(hotelName);
    	}
		Long s = null;
		if(!"".equals(startTime)){
			s = TimeUtils.formatDateStringToInt(startTime);
			criteria.andCreateTimeGreaterThanOrEqualTo(s);
		}
		Long e = null;
		if(!"".equals(endTime)){
			e = TimeUtils.formatDateStringToInt(endTime);
			criteria.andCreateTimeLessThanOrEqualTo(e);
		}
		example.setOrderByClause("create_time desc");
		return goodsMapper.selectByExample(example);
	}
	
	public int udpate(Goods goods) {
		return goodsMapper.updateByPrimaryKeySelective(goods);
	}
}