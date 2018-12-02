package com.yc.junit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.TYPE,ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)

public @interface Ignore {

}
