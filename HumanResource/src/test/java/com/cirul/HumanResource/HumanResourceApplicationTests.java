package com.cirul.HumanResource;

import com.alibaba.druid.support.json.JSONUtils;
import com.cirul.HumanResource.entity.User;
import com.cirul.HumanResource.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HumanResourceApplicationTests {

	@Autowired
	UserService userService;



	@Test
	public void contextLoads() {
	}

	@Test
	public void UserServiceTest(){
		User u = new User();
		u.setLoginName("loginName2");
		u.setPassword("password");
		u.setName("Test user name");
		u.setJwtToken("JWT");
		u.setCreateTime(System.nanoTime());
		 userService.addUser(u);
	}
}
