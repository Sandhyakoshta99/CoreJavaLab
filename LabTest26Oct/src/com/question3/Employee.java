package com.question3;

import java.util.Scanner;

public class Employee //declaring a class
{
	
		public static void main(String args[])   //main method
	{
		Scanner sc=new Scanner(System.in);  //creating a scanner obj 
		//declaring a local variables 
		int id;
		int salary;
		String name,address,department;
		System.out.println("Enter the Employee Id :");  //taking input
		id=sc.nextInt();
		System.out.println("Enter the Employee Salary :");  //taking input
		salary=sc.nextInt();
		System.out.println("Enter the Employee Name :");  //taking input
		name=sc.next().toLowerCase();
		System.out.println("Enter the Employee Address :");  //taking input
		address=sc.next().toLowerCase();
		System.out.println("Enter the Employee Department:");  //taking input
		department=sc.next().toLowerCase();
	}  //end of main
	
	

} //end of class 
