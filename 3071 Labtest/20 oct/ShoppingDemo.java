/*Q1. wap to give 10% descount to the user whose shopping bil id
@author: sandhya
@Date: 20.10.22*/

import java.util.Scanner; //Importing packages
class ShoppingDemo   //Creating class
{
	public static void main(String args[]) //main started
	{
		Scanner sc = new Scanner(System.in); //scanner obj
		System.out.println("Quantity of Diwali gifts you want: ");
		int qty = sc.nextInt();//taking input 
	
		int total = 540*qty;//total bill
		System.out.println("Your bill amount is = "+total); //declaring and initializing the value of variable 
		
		if(total>=2000) // checking if else condetion
		{
			int bill = total-(total*10)/100;
			System.out.println("Bill after 10% discount is: "+bill);
		}
		else
		{
			System.out.println("Thanks for shopping... welcome to again");
		}//end ifelse
	}//end main method
}//end of class Shopping 
