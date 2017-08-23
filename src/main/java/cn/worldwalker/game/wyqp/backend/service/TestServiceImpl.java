package cn.worldwalker.game.wyqp.backend.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.worldwalker.game.wyqp.backend.common.utils.redis.JedisTemplate;
import cn.worldwalker.game.wyqp.backend.dao.TestDao;
import cn.worldwalker.game.wyqp.backend.domain.TestModel;
@Service
public class TestServiceImpl implements TestService{
	@Autowired
	private TestDao testDao;
	@Autowired
	private JedisTemplate jedisTemplate;
	@Override
	public List<TestModel> getTest() {
		
		System.out.println(jedisTemplate.get("ddddd"));
		List<TestModel> list = testDao.test(new HashMap<String, Object>());
		return list;
	}
	
}
