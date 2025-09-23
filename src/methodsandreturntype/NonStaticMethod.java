package methodsandreturntype;

public class NonStaticMethod {
	
	// Non-static method without return type
	void testNonStatic(String name)
	{
		System.out.println("Here is the non Static method with no return value "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//Created the OObject to call the  non Static Method
		NonStaticMethod NP=new NonStaticMethod();
		//Calling Non Static Method
		NP.testNonStatic("Ankur");
	}

}
