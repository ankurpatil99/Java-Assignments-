package Interfaces;



//Class HDFS is implementing the methods in the ATM Interfaces
class HDFC implements ATM{
	
	private int balance=20000;
	
	public  void withdraw(int amount)
	{
		if (amount<=balance )
		{
			balance-=amount;
			System.out.println("HDFC: Withdraw "+ amount+"Remamining balance "+balance);
			
		}
		else 
		{
				System.out.println("Insufficient Balance");
		}
	}
	
	public void checkbalance()
	{
		System.out.println("HDFC balance is "+balance);
	}

}
