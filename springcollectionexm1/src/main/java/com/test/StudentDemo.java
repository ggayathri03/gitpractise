package com.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentDemo {
  public static void main(String[] main) {
	  ApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigStudent.class);
	  
	  Student obj1= ctx.getBean("getSetterObj",Student.class);
	  obj1.setId(111);
	  obj1.setName("hrithik");
	  obj1.setSkills(Arrays.asList("java","python","OS","DBMS"));
	  obj1.setCollege("Roshan");
	  
	  System.out.println(obj1);
	  
	  Student obj2= ctx.getBean("getConstObj",Student.class);
	  System.out.println(obj2);
  }
}
