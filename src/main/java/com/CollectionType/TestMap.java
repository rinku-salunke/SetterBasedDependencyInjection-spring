package com.CollectionType;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMap {

	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		
       StudentMap s=(StudentMap) ac.getBean("s");


//       System.out.println(s.getMap());

       
       
       s.getMap().forEach((k,v)->System.out.println(k+ " " +v));
       
       
    	   
       }
       }
	


