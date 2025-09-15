package controlstatement;

import java.util.Scanner;

public class SwitchCaseExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Its a Switch case program which helps to find out the Month Number and also Printing the name 
		
		Scanner myscn=new Scanner(System.in);
		System.out.print("Enter the Name of the Month"+"\n");
		String name=myscn.nextLine();
		
		switch(name)
		{
		
			/*If user Enter input as "January" it will Execute the first Statement and then Break the Execution after this 
		    Case as the case it matched with Input Value. In below Program once it got the Input value matched with the case it get breaks and stop the Execution
		    and it no case i matched then default case is execuited*/
			case "January": System.out.println("Its a First Month January");
				break;
				
				/*If user Enter input as "February" it will Execute the first Statement and then Break the Execution after this 
			    Case as the case it matched with Input Value... */	
				
			case "February":System.out.println("Its a 2 Month  February");
				break;
				
			case "March": System.out.println("Its a third month March");
				break;
				
			case "April": System.out.println("Its a 4 onth April");
				break;
				
			case "May": System.out.println("Its a 5 month May");
				break;
			
			case "June": System.out.println("Its a 6 month June");
				break;
				
			case "July": System.out.println("its a 7 month July");
				break;
				
			case "August": System.out.println("its a 8 month August");
				break;
				
			case "September": System.out.println("Its a 9 month September");
				break;
				
			case "October": System.out.println("Its 10 Month October");
				break;
				
			case "November": System.out.println("Its a 11 month  November");	
				break;
				
			case "December": System.out.println("Its a12 month Decmber");
				break;
				
			default: System.out.println("Its a invalid month");//Its the default is not written then this statement will execute everytime when program run
			
			}
	}

}
