/*
Program: WAP to print the take input of age of 3 peopel by user and determine oldest and youngest among them...
@author:Sandhya 
@Date: 20 oct 2022  
*/
import java.util.Scanner;          //import util packages for Scanner class
class AgeDemo               // declaring a class
{
	public static void main(String args[])   //main mathod start
	{
	Scanner sc = new Scanner(System.in);   //declaring object of Scanner class
	int age1,age2,age3;                           //declaring a variables

	System.out.println("Enter the Age1: ");    //taking input
	age1= sc.nextInt();
	System.out.println("Enter the Age2  : ");
	age2= sc.nextInt();
	System.out.println("Enter the Age3: ");
	age3= sc.nextInt();
	
	if((age1>=65)&&(age1>=age3))       //cheaking age 
		System.out.println("This age peopel called oldest!!: "+age1 );
		else if(age2>=18)
			System.out.println("This age peopel called youngest!!: " +age2);
	else if(age3<=18)
		System.out.println("This age peopel called child!!: "   +age3);
	else
		System.out.println("This age peopel called!!:"+age1+" "+age2+" "+age3);
		
	}// End of main method
}// end of class  AgeDemo        