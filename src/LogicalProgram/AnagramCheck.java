package LogicalProgram;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1=new Scanner (System.in);
		
		System.out.println("Enter First String");
		String str1=sc1.nextLine();
		
		System.out.println("Enter Second  String");
		String str2=sc1.nextLine();
		
		//It will remove the Spaces in Character
		str1=str1.replaceAll("\\s", "");
		str2=str2.replaceAll("\\s", "");
		
		//to convert all string in Lower Case. As if you add any one letter in Upper Case then it will give you wrong answer
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		//Converting String Array in to Char Array
		char[]arr1=str1.toCharArray();
		char[]arr2=str2.toCharArray();
		
		//Sorting both Arrays using Arrays Function
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("The String are Anagram");
		}
		else 
		{
			System.out.println("Not an Anagram String");
			
		}
		sc1.close();
	}

}
