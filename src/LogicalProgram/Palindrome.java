package LogicalProgram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Word");
		String str=sc.nextLine();
		
		String  rev="";
		
		for (int i=str.length()-1;i>=0;i--)
		{
			rev =rev + str.charAt(i);
			
		}
		
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println(str +" is Palendrome");
		}
		else
		{
			System.out.println(str +" Not Palendrome");
		}

	}

}
