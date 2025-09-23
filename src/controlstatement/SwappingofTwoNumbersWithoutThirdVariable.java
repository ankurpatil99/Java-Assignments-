package controlstatement;

public class SwappingofTwoNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 int x=10;
			 int y=20;
			 
			 System.out.println("Before Swapping numbers are " + x + " " + y);
			 
			 x=x+y;
			 y=x-y;
			 x=x-y;
			 
			 System.out.println(+ x + " " + y);
	}

}
