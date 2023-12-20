package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ty")
public class MyConfig 
{
	@Bean(name="myStudent")
		public Student getStudent()
		{
			return new Student();
		}
	
	@Bean(name="connection")
	public Connection getConnection() 
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection("URL","Username","password");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
		
	

}
