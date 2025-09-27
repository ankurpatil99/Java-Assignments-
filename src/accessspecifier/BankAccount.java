package accessspecifier;

import java.nio.file.attribute.AclEntryType;

public class BankAccount {
	
		
		public String ACHolder="Ankur";
		private double balnace=5000.00;
		protected String branch="Pune";
		String ACType="Saving";
		
		public void ShowAccholder()
		{
			System.out.println("Accont Holder="+ACHolder);
		}
		
		private void Balance()
		{
			System.out.println("Balance is :"+balnace);
		}
		
		protected void Branch()
		{
			System.out.println("Branch is :"+branch);
		}
		
		void ACcountType()
		{
			System.out.println("Accout Type is :"+ACType);
		}
		public void  accessPrivarebalance()
		{
			Balance();
		}

}
