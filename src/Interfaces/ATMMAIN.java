package Interfaces;



//Its a main class where we can create a object of differenet classes which implements from ATM
public class ATMMAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATM sbi=new SBI();
		sbi.checkbalance();
		sbi.withdraw(1000);
		
		sbi.checkbalance();
		
		ATM HD= new HDFC();
		HD.checkbalance();
		HD.withdraw(100000);
		HD.checkbalance();
		
		
				 
	}

}
