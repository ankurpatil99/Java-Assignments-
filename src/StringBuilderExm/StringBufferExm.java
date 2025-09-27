package StringBuilderExm;

public class StringBufferExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			

		StringBuffer Str1=new StringBuffer("Ankur Patil ");
		
		//Append text
		Str1.append("Rohan");
		System.out.println("Appended Text is : "+Str1);
		
		//Insert Text
		//System.out.println("\n");
		Str1.insert(6, "Avanish");
		System.out.println("Insert of text : "+Str1);
		
		//Replace Text
		Str1.replace(6, 11, "Roshan");
		System.out.println("Replaced Text is :"+Str1);
		
		//Delete the text from the Index
		Str1.delete(6, 13);
		System.out.println("text after Delete: "+Str1);
		
		//Reverse the String
		Str1.reverse();
		System.out.println("Reverse of String is: "+Str1);
		
		System.out.println("Capacity of the String :"+Str1.capacity());
	}

}
