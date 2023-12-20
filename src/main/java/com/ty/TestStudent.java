package com.ty;

import java.sql.Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStudent
{
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Student stud= (Student)context.getBean("myStudent");
		stud.play();
		
		
		
	}

}
