package com.PrimitiveType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		
		Student s=(Student) ac.getBean("s");
		
		
		System.out.println(s.getRollno());
		
		System.out.println(s.getName());
		
		System.out.println(s.getAddress());
		
		
		
		
	}

}
