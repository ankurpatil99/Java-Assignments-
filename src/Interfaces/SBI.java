package Interfaces;



//Class HDFS is implementing the methods in the ATM Interfaces
class  SBI implements ATM {
	
	private int balance=10000;
	
	public  void withdraw(int amount)
	{
		if (amount<=balance )
		{
			balance-=amount;
			System.out.println("SBI: Withdraw "+ amount+"Remamining balance "+balance);
		}
		else 
		{
				System.out.println("Insufficient Balance");
		}
	}
	
	public void checkbalance()
	{
		System.out.println("SBI balance is "+balance);
	}

}
