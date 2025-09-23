package array;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String name="    AnkurPatil   ";
		String Email=" Ankur.Patil@Gmail.Com   ";
		String Pass="   Welcome   ";
		String Password="   ";
		// Trim Function
		//Using the trim Function extra spaces get removed form all the three Values
		String st1=name.trim();
		String str2=Email.trim();
		String Str3=Pass.trim();
		//To Print the Trimmed Data		
		System.out.println("After trimming the details are "+ "\n"+st1 +"\n" +str2 +"\n"+Str3);
		
		//Masking the Password which Prints the Password in the "***" Format
		String psw=Pass.replaceAll(".", "*");
		System.out.println("Masked Password is "+psw);
		
		//Convert Email to lower Case
		String lc=Email.toLowerCase();
		System.out.println("Formated lower Case Email ID is "+lc);
		
		//to Check Length of the String here we verify the lenght of password 
		int Pd=Str3.length();
		if(Pd > 5)
		{
			System.out.println("Password Aceptable");
		}
		else if(Pd<5)
		{
			System.out.println("Password is to Short");
		}
		
		//check email ends with @gmail.com
		boolean  Em=str2.endsWith("Com");
		if(Em==true)
		{
			System.out.println("Valid Email");
		}
		else
		{
			System.out.println("Invalid Email");
		}
		
		//String Concat 
		String Gr="Welcome ".concat(st1);
		System.out.println( Gr);
		
		//to Check Email id Contains @ and .
		if(str2.contains("@"))
		{
			System.out.println("Valid Email ID");
		}
		else
		{
			System.out.println("Invalid Email ID");
		}
		
		//To verify Password is Blank  or Not
		if(Password.isBlank())
		{
			System.out.println("Password is Emplty enter Password");
		}
		else 
		{
			System.out.println("Valid Password");
		}
		
		//to verify Password is Emplty or not
		
		if(Password.isEmpty())
		{
			System.out.println("Password Empty");
		}
		else 
		{
			System.out.println("Valid Password");
		}
		
		
		String fruits = String.join("Ankur", "Orange", "Apple","B","Mango");
		System.out.println(fruits);
			
	}

}
