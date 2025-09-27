package controlstatement;

import java.util.Scanner;

public class ReverseStringWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//String str1;
			String Rev="";
			System.out.println("Enter the String ");
			Scanner SC=new Scanner(System.in);
			String  S=SC.next();
			int i=S.length()-1;
			
			while(i>=0)
			{
				Rev=Rev+S.charAt(i);
				i--;
				
			}
			System.out.println("Original String: "+S);
			System.out.println("Reverse of String : "+Rev);
			
			
			
			
			
	}

}
