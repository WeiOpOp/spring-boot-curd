package com.neo.test;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.neo.common.TimeUtils;
import com.neo.entity.Goods;
import com.neo.mapper.GoodsMapper;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

	@Autowired
	private GoodsMapper goodsMapper;

	@Test
	public void testInsert() throws Exception {
		for(int i=10;i<30;i++){
			String uid = UUID.randomUUID().toString().substring(0,5)+i;
//			goodsMapper.insert(new Goods(TimeUtils.getCurrentTime(), "快捷酒店", 
//					10D, 10L, 10D, 10L,
//					10D, 10L, 10D, 10L,
//					10D, 10L, 10D, 10L,
//					10D, 10L, 10D, 10L,
//					10D, 10L, 10D, 10L,
//					10D, 10L, 10D, 10L));
		}
		
	}

}
