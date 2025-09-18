package controlstatement;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S;
		String Rev="";
		System.out.println("Enter the String ");
		Scanner SC=new Scanner(System.in);
		S=SC.nextLine();
		for (int i=S.length()-1;i>=0;i--)
		{
			Rev=Rev+S.charAt(i);
		}
		System.out.println("Reverse of String is "+Rev);
		
	}

}

