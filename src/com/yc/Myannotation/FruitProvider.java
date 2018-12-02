package com.yc.Myannotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface FruitProvider {
	
	// 设置 供应商id 默认值
	public int ID() default -1;
	
	//设置 供应商 name 默认值
	public String name() default "";
	
	//设置 供应商 address 默认值 
	public String address() default "";
	
}
