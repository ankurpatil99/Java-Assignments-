package operators;

public class IncreamentalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int i=0;
		
		for(i=0;i<=10;i++)
		{
			System.out.println("The Number is "+i);
		}
		// Once the Condition is not matched then it will Exit  from the Loop and the last value assinged to i is 10
		
		System.out.println("\n");
		
		//Reassigning the i value to 1 as the value of i is 10 in last for loop Execution
		i=1;
		
		for(i=10;i>=0;i--)
		{
			System.out.println("The Number is "+i);
			//System.out.println(i);
		}
		
	}

}
