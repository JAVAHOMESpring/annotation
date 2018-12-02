package com.yc.test;

import java.lang.reflect.InvocationTargetException;

import com.yc.junit.Junit;

public class Jtest {

	public static void main(String[] args) {
		try {
			Junit.run(JunitTest.class);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
