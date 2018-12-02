package com.yc.junit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Junit {
	
	public static void run(Class  clazz) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Method[] method =  clazz.getDeclaredMethods();
		//将 用 @Test修饰的 的方法存储在一个集合中
		List<Method> testList =new  ArrayList<Method>(); 
		//存储 @Before 修饰的方法
		Method beforeMethod = null;
		//存储 @After 修饰的方法
		Method afterMenthod = null;
		
		for(Method m : method){
			if(m.isAnnotationPresent(Test.class)){				
				testList.add(m);
			}else if(m.isAnnotationPresent(Before.class)){
				beforeMethod=m;
			}else if(m.isAnnotationPresent(After.class)){
				afterMenthod=m;
			}			
		}
		System.out.println("共有"+testList.size()+"个test测试方法");
		//通过反射实例创建一个对象
		Object obj =  clazz.newInstance();
		//循环使用@Test注解 修饰的方法  
		//注意执行每个方法之前若有@Before修饰的 方法，则先去执行@Before修饰的 方法， 之后  (@After)反之同理 
		for(Method m : testList){
			//判断是否有 @Before 注解修饰的方法 ，若有 激活 
			if(null != beforeMethod){
				beforeMethod.invoke(obj,null);
			}
			//执行 @Test 修饰的方法
			m.invoke(obj, null);
			// @After 与 @Before 相反
			if(null != afterMenthod){
				afterMenthod.invoke(obj, null);
			}
			
		}
		
		
		
		
	}

}
