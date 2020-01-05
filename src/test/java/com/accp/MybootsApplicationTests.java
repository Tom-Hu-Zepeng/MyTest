package com.accp;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.EmpBiz;
import com.accp.pojo.Dept;
import com.accp.pojo.Emp;

@SpringBootTest
class MybootsApplicationTests {
	
	@Autowired
	private EmpBiz emplp;

	@Test
	void contextLoads() {
		Dept de=emplp.queryById(1);
		for (Emp ko : de.getEmp()) {
			System.out.println("在"+ko);
		}
	}
}
