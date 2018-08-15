package com.xx.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xx.po.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class UserMapperTest {
	@Autowired
	private UserMapper mapper;
	
	@Test
	public void selectAllTest() {
		List<User> list = mapper.getAllUser();
		for (User user : list) {
			System.out.println(user);
		}
	}
}
