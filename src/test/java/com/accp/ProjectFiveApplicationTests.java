package com.accp;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.WaresBiz;
import com.accp.pojo.Wares;

@SpringBootTest
class ProjectFiveApplicationTests {
	@Resource
		private  WaresBiz biz;
	
	@Test
	void contextLoads() {
		System.out.println(biz.addWare(new Wares()));
		
	}

}
