package methodsandreturntype;


public class ReturnTypeAssignment {
	
	//NoStatic Method
	public int myAdd(int x, int y)
	{
		return x+y;
	}
	
	//Static method
	public static  void multiplication(int x, int y)
	{
		int z= x*y;
		
		System.out.println("Amultiplication is "+z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to Call non Static method we created object 
		ReturnTypeAssignment NS=new ReturnTypeAssignment();
		
		//Calling the non Static method using object
		int z=NS.myAdd(35, 40);
		System.out.println("Addition is "+z);
		
		//Calling Static Method from Same class
		multiplication(10, 20);
	}

}
