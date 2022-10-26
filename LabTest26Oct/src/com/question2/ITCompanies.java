package com.question2;

import java.util.Scanner;

public class ITCompanies                      //declaring a class
{ 
	//method to print 
	static void printITCompanies(String IT)
	{
		switch (IT)                  //switch case
		{
		case "tcs":System.out.println("----------Tata Consultancy Services-------------");
		break;
		case "infosys":System.out.println("-----------Information System-------------");
		break;
		case "wipro":System.out.println("-------Western india Palm Refined Oils Limited-----------");
		break;
		
		} //end switch case
	}
	
 public static void main(String args[])  //main method 
 {

	 Scanner sc=new Scanner(System.in);     //declaring a obj of scanner class
	 String  inputcompanies;
	 System.out.println(".......................Enter the Companie Name.........................");  //take input
	 inputcompanies=sc.next().toLowerCase();            //declaring obj
	 printITCompanies(inputcompanies);    //calling method
 }
}
