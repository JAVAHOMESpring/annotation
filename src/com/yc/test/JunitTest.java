package com.yc.test;

import com.yc.junit.After;
import com.yc.junit.Before;
import com.yc.junit.Test;

public class JunitTest {

	Caculator c = new Caculator();
	
	@Before
	public  void beforeTest(){
		System.out.println("before..............");
	}
	
	@Test
	public void addTest(){
		c.add(20, 30);
	}
	
	@Test
	public void deleTest(){
		c.dele(20, 30);
	}
	
	@After
	public void afterTest(){
		System.out.println("after............");
	}
	

}
