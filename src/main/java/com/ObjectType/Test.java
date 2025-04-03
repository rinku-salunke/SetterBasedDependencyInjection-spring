package com.ObjectType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		
		Student s=(Student) ac.getBean("s");
		
		System.out.println(s.getAdr().getAreaname());
		
	}

}
