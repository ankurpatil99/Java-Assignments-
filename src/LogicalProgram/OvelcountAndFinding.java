package LogicalProgram;

import java.util.Scanner;

public class OvelcountAndFinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		
		//Convert String intoLower Case
		String str=sc.nextLine().toLowerCase();
		
		int Count=0;
		
		System.out.println("Ovels Found  ");
		
		for (int i=0;i<str.length();i++)
		{
			//To read the character
			
			char ch=str.charAt(i);
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch+ " ");
				Count++;
				
			}
			
		}
		System.out.println("Number of Ovels are "+Count);
	}

}
