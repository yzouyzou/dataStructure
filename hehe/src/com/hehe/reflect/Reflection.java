package com.hehe.reflect;

import java.lang.reflect.InvocationTargetException;

public class Reflection {
	//一个类 只有一个Class实例
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, NoSuchFieldException{
		try {
			Class clazz = Class.forName("com.hehe.reflect.Person");
			Object obj = clazz.newInstance();
			System.out.println(obj);
			try {
				String h = (String) obj.getClass().getMethod("setName", String.class).invoke(obj, "xiaoming");
			    String dfsdf = (String) obj.getClass().getMethod("getName").invoke(obj);
			    System.out.println(dfsdf);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
