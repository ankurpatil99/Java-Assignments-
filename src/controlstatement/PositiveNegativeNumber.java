package controlstatement;

import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner myscn=new Scanner(System.in);
		
		System.out.print("Enter the Number "+"\n");
		int Number=myscn.nextInt();
		
		if(Number>0)
		{
			System.out.println("Its a Postive Number");
		}
		else
		{
			System.out.println("Its a negative Number");
		}
		
	}

}
