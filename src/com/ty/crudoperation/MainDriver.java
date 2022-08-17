package com.ty.crudoperation;

import java.util.Scanner;

public class MainDriver {
	
	public static void main(String[] args) {
	
		StudentCrud std = new StudentCrud();
		
		Scanner s = new Scanner(System.in);
		
		boolean repete =true;
		do {

			System.out.println("Enter your Choice ");
			System.out.println("1:Add Student");
			System.out.println("2:Delete Student");
			System.out.println("3:Update Student");
			int choice = s.nextInt();
			
			switch(choice) 
			{
			
			case 1:
				System.out.println("Enter the Student id ");
			    int id = s.nextInt();
			    System.out.println("Enter the Student name ");
			    String name = s.next();
			    System.out.println("Enter the Student age ");
			    int age = s.nextInt();
				std.saveStudent(id,name,age);
				System.out.println("Data Added");
				break;
				
			case 2:

				System.out.println("Enter the Student id ");
			    int id1 = s.nextInt();
			    std.deleteStudent(id1);
			    System.out.println("Data Deleted");
			    break;
			    
			case 3:
				System.out.println("Enter the Student id ");
			    int id2 = s.nextInt();
			    System.out.println("Enter the Student name ");
			    String name2 = s.next();
			    System.out.println("Enter the Student age ");
			    int age2 = s.nextInt();
			    std.updateStudent(id2, name2, age2);
			    System.out.println("Data Updated");
			    break;
			    
			case '4': repete=false;
			default : System.out.println("invalid cholice");
			break;
	 
			}
			
		} 
		while (repete);
	}

}