package controlstatement;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				int a=10;
				int b=20;
				int c=1000;
				
				/* if-else-if ladder is used to evaluate multiple conditions sequentially. 
				 * It allows a program to check several conditions and execute the block of code associated with the first true condition. */
				
				if(a>b&&a>c)
				{
					System.out.println("A is Greaterthan A and B");
				}
				
				else if(b>a&&b>c)
				{
					System.out.println("B is Greater than A and B");
				}
				
				else if(c>a&&c>b)
				{
					System.out.println("C is Greater than A and B");
				}
										
		}

	}
