package com.springboot.example.dao.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
import com.springboot.example.SpringbootBootstrap;
import com.springboot.example.common.UUIDGenerator;
import com.springboot.example.dao.UserDao;
import com.springboot.example.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringApplicationConfiguration(classes = SpringbootBootstrap.class)
@Transactional
public class UsesrDaoTest {

	@Autowired
	private UserDao userDao;
	
	@Test
	public void testInsert(){
		User user = new User();
		user.setId(UUIDGenerator.getUUID32Bit());
		user.setStat((byte)1);
		user.setUsername("rkzhang");
		user.setPassword("123456");
		user.setPasswordSalt(UUIDGenerator.getUUID32Bit());
		user.setCreateTime(new Date());
		user.setLastUpdateTime(new Date());
		userDao.insert(user);
	}
}
