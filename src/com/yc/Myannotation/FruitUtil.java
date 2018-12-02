package com.yc.Myannotation;

import java.lang.reflect.Field;

/**
 * 注解的处理器
 * */

public class FruitUtil{
	
	
	public static void getFruitUtil(Class<?> clazz){
//		String strname= "水果名称：";
//		String strcolor="水果颜色：";
//		String strprovider="供应商：";
		//通过反射实例得到 实例中的所有字段名称
		Field[] field =  clazz.getDeclaredFields();
		for( Field f : field ){
			//判断该字段是否用 FruitName 做注解
			if(f.isAnnotationPresent(FruitName.class)){
				FruitName fruitName = f.getAnnotation(FruitName.class);
				
				System.out.println("水果名称："+fruitName.name());
			}else if(f.isAnnotationPresent(FruitColor.class)){
				FruitColor fruitColor = f.getAnnotation(FruitColor.class);
				System.out.println("水果颜色："+fruitColor.color());
			}else if(f.isAnnotationPresent(FruitProvider.class)){
				FruitProvider fruitProvider = f.getAnnotation(FruitProvider.class);
				System.out.println("供应商编号："+fruitProvider.ID()+"\n供应商名称："+
				                   fruitProvider.name()+"\n供应商地址："+fruitProvider.address());
			}
		}
		
	}
	
	
}
