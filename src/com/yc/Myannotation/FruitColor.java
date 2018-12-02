package com.yc.Myannotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented

/**
 * @Target
指定注解使用的目标范围(类、方法、字段等),其参考值见类的定义:java.lang.annotation.ElementType
@Documented
指定被标注的注解会包含在javadoc中。
@Retention
指定注解的生命周期(源码、class文件、运行时),其参考值见类的定义:java.lang.annotation.RetentionPolicy
@Inherited
指定子类是否可以继承父类的注解,只能是类上的注解,方法和字段的注解不能继承。即如果父类上的注解是@Inherited修饰的就能被子类继承。
 * 
 * */

public @interface FruitColor {
	//苹果 color 的枚举
	public enum Color{red,green,yellow};
	
	//设置苹果color 的默认值 
	Color color() default Color.red;

}
