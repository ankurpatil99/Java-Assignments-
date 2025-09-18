package controlstatement;

public class SimpleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			//Learning simple If condition and we are finding greater number from the two numbers
			int a=1000;
			int b=100;
			
			/*Here it is verifying the condition that if a is Greater than b. If Condition is Satisfied then 
			 it Executed the Print Statement inside loop and break the Execution 
			*/
			if (a>b)
			{
				System.out.println("A is bigger than the B "+a);
			}
			//If the First Condition is False then it is Straigh away execuiting the Else loop and print the Statement inside Else
			else
			{
				System.out.println("B is Greater than A "+b);
			}
	}

}
