package com.yc.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		//TODO 通过类路径获取这个Student类
		Class c =Class.forName("com.yc.test.Student"); 
		
		//TODO 获取类里面的字段名（属性名）
		Field[] field =  c.getDeclaredFields();
		for ( Field f : field ){
			
			System.out.println(f);
		}
		
		//TODO 获取类里面的方法名
		Method[]  method = c.getDeclaredMethods();
		//TODO 调用类里面的无参数 的构造方法 创建一个实体
		Student s= (Student) c.newInstance();
		for(Method m : method){
			if("setName".equals(m.getName())){
				//TODO 激活m方法 并给其设值
				m.invoke(s,"张三");  
				
			}
			if("setAge".equals(m.getName())){
			
				m.invoke(s,"22");
			}
		}
		System.out.println(s);
		

		//TODO 获取类里面的 无参和有参的 构造方法名
		Constructor[] con =   c.getConstructors();
		
		for (Constructor c2 : con){
			System.out.println(c2);
		}
		
		

	}

}
