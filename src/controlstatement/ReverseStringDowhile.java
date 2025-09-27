package controlstatement;

import java.util.Scanner;

public class ReverseStringDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String Rev="";
		System.out.println("Enter String ");
		Scanner Sc=new Scanner(System.in);
		String S=Sc.next();
		int i=S.length()-1;
		
		do
		{
			Rev=Rev+S.charAt(i);
			i--;
		
		}while(i>=0);
		
		System.out.println("Original  String: "+S);
		System.out.println("Reverse of String: "+Rev);
		
	}

}
