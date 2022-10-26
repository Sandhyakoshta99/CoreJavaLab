/*Program: A Student will not be allowed to sit in exam if his attendence is less than 75%...............
 * @auther: Sandhya 
 * @Date:26 oct 2022;
 */
package com.question1;

import java.util.Scanner;
 class Student //declaring a class
{
   public static void main(String args[])  //main method 
   {
	   Scanner sc=new Scanner(System.in);   //declaring obj for scanner
	   int s1,s2;                //declaring a variables
	   //taking input 
	   System.out.println("Enter the no. of classes Attend :");
	   s1=sc.nextInt();      //creating obj
	   
	   System.out.println("Enter the no. of classes Not Attend :");
	   s2=sc.nextInt();      //creating obj
	   
	   float s;                //calculating the attendenc
	   s=(s2/s1)*100;
	      if(s>=75)            //if condition
	    	  System.out.println("You are eligible for sit on exam :"+s);
	      else
	    	  System.out.println("You are not eligible for sit on exam :"+s);	  
	    
   }    //end of main 
}//end of class