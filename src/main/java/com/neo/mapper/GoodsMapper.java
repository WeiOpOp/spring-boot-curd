package com.neo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neo.entity.Goods;
import com.neo.entity.GoodsExample;
@Mapper
public interface GoodsMapper {
	List<Goods> findAll();
	
	List<Goods> selectByExample(GoodsExample example);
	 
    int deleteByPrimaryKey(Long id);

    int insert(Goods goods);

    int insertSelective(Goods goods);

    Goods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Goods goods);

    int updateByPrimaryKey(Goods goods);
    
    int deleteByExample(GoodsExample example);

}