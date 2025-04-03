package com.CollectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestList {

	
public static void main(String[] args) {
			
ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");

StudentList s=(StudentList) ac.getBean("s");

for(String str:s.getNames()) {
	System.out.println(str);
}
System.out.println(s.getNames());
}
}