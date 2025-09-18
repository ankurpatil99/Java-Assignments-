package controlstatement;

import java.util.Scanner;

public class SwtichCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/*  the  switch statement executes one statement from multiple conditions. If it match with the Case then it print the statements inside the Case*/
		Scanner myscn=new Scanner(System.in);
		System.out.print("Enter the Day of the week in Number"+"\n");
		int weekNum=myscn.nextInt();
		
		switch(weekNum)
		{
		case 1:System.out.println("Its Monday");
		break;
		
		case 2:System.out.println("Its Tuesday");
		break;
		
		case 3:System.out.println("Its Wednsday");
		break;
		
		case 4:System.out.println("Its Thursday");
		break;
			
		case 5:System.out.println("Its Friday");
		break;
		
		case 6:System.out.println("Its Saterday");
		break;
		
		case 7:System.out.println("Its Sunday");
		break;
		
		default: System.out.println("Its a invalid number");
		}
	}

}
