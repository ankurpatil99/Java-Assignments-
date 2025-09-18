package controlstatement;

import java.util.Scanner;

public class PrintWeekNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*If else ladder example. we need to change the Week number manually here
		to take a input form the user need to use scanner class and need to create a object of that class to reserve the Space in memory
		here i have created myscn  object which stores the input value in number which entered by user*/
		
		Scanner mysca=new Scanner(System.in);
		System.out.print("Enter a number between 1 to 7"+"\n");
		
		int weeknumber=mysca.nextInt();
		
		if(weeknumber==1)
		{
			System.out.println("Its a Monday");
		}
		else if(weeknumber==2)
		{
			System.out.println("Its a Tuesday");
		}
		else if(weeknumber==3)
		{
			System.out.println("Its a Wednesday");
		}
		else if(weeknumber==4)
		{
			System.out.println("Its a Thursday");
		}
		else if(weeknumber==5)
		{
			System.out.println("Its a Friday");
		}
		if(weeknumber==6)
		{
			System.out.println("Its a Saterday");
		}
		else if(weeknumber==7)						//if we no add if condition here then when we run the program everytime this statement will get run
		{
			System.out.println("Its a Sunday");
		}
		
	}

}
