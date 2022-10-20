/*
Program: wap to find the square,cube,check number is evenor odd.............
@author: Sandhya Koshta
@Date: 20 oct 2022  
*/
import java.util.Scanner;  //import packages 
class Square   //declar class
{
	ststic void square(float n1,float n2)//dummy arguments 
	{
	float result=n1^2,n2^2;
	  System.out.println("The result is :"+result);
	  
	}    //end of method square
      
	  
	  ststic void cube(float n1,float n2)//dummy arguments 
	{
	float result=n1^3,n2^3;
	  System.out.println("The result is :"+result);
	  
	}    //end of method cube

      
	  ststic void even(float n1,float n2)//dummy arguments 
	{
	float result=n1%2;
	  System.out.println("The result is even:"+result);
	  
	}    //end of method cube

     ststic void odd(float n1,float n2)//dummy arguments 
	{
	float result=n1%3;
	  System.out.println("The result is odd:"+result);
	  
	}    //end of method cube



	public static void main(String args[])             //main started
	{
		Scanner sc = new Scanner(System.in);             //declar object of scanner 
		float n1,n2; //creating variable 
		int choice;
		
		System.out.println("Enter tow number :");
		n1=sc.nextFloat();
		n2=sc.nextFloat();
		//menu 
		
		System.out.println("1. Square");
		System.out.println("2. cube");
		System.out.println("3. even");
		System.out.println("4. odd");
		choice=sc.nextInt("5. exit");
		
		
		
		printDay(day);      
		//calling method to print day
		static void square(float n1,float n2)   	// method to print the day	
	   switch(choice)      //switch case
	   {
		    case 1:square("n1,n2");
		          break;
		    case 2:cube("n1,n2");
		          break;
		    case 3:even("n1,n2");
		          break;
		  case 4:odd("n1,n2");
		          break;
		     case 5:System.exit(0);
		          break;
		   default: System.out.println("Wrong input");
		         
	   }     // end of switch
		    
	}// end of main
}   // end of class 