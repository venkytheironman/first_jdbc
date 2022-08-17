package com.ty.crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentCrud {
	
	private String name;
	private String id;
	private String age;
	private String n;
	private String i;


	public void saveStudent(int i, String n, int a) {
		
		String url = "jdbc:mysql://localhost:3306";
		String username="root";
		String password  = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con  = DriverManager.getConnection(url,username,password);
			
			Statement stm  = con.createStatement();
			
			String str = "INSERT INTO ty_learn.student VALUES("+i+",'"+n+"',"+a+")";
					
			stm.execute(str);
			
			stm.close();
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	
	}
	
	
	public void deleteStudent(int id)
	{
		String url = "jdbc:mysql://localhost:3306";
		String username="root";
		String password  = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			Statement str = con.createStatement();
			
			
			String str1 = "delete from ty_learn.student where id="+id;
			
			str.execute(str1);
			str.close();
		
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}
	
		public void updateStudent(int id,String name,int age) {
			String url = "jdbc:mysql://localhost:3306";
			String username="root";
			String password  = "root";
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con = DriverManager.getConnection(url,username,password);
				
				Statement str = con.createStatement();
				
				
				String stm = "INSERT INTO ty_learn.student VALUES("+id+",'"+name+"',"+age+")";
				
				str.execute(stm);
				str.close();
			
				
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		
		
		}
}
