package accessspecifier;

public class BankAccountmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		BankAccount BK =new BankAccount();
		System.out.println(BK.ACHolder);//public Method
		System.out.println(BK.ACType);//Protected Method
		System.out.println(BK.branch);// Its a Public Method
		//System.out.println(BK.balance); //Its a Provate method
		
		BK.ShowAccholder();  //Public
		BK.ACcountType();    //Protected
		BK.Branch();         // default 
		BK.accessPrivarebalance();
	}

}
