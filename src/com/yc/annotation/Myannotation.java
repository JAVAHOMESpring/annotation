package com.yc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


@Target(value={ElementType.FIELD,ElementType.METHOD})
public @interface Myannotation {
	

}
