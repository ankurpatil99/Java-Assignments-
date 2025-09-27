package controlstatement;

import java.util.Scanner;

public class ReverseStringForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
			System.out.println("Enter the String");
			Scanner SC =new Scanner(System.in);
			//this will read the character till next line
			String st=SC.nextLine();
			// it will read  the character from string and store in chars[] array
			char[] chars=st.toCharArray();
			
			//taken this empty array char[]RevChar which is having lenght is same as chars[]
			char[] RevChar=new char[chars.length];
			
			//to initialise the indes and it will start from the last
			int i=chars.length-1;
			
			//it will go to each character in Chars array
			for(char ch:chars)
			{
				//it will store the character in RevChar[] array
				RevChar[i]=ch;
				
				//it will reduces the index
						i--;
			}
			
			//this will convert the RevChar[] array back to string
			String Revs=new String(RevChar);
			System.out.println("Original String: "+st);
			System.out.println("Reverse of strig is: "+Revs);
	}

}
