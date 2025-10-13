package Abstraction;

abstract  class Cars {

	abstract void start();
	abstract void accelarate();
	abstract void  brk();
	
	public void fuel()
	{
		System.out.println("Car needs fuel to run");
	}
	
}

class tesla extends Cars
{
	void start()
	{
		System.out.println("To Start the  Push Start Button availabel ");
	}

	@Override
	void accelarate() {
		// TODO Auto-generated method stub
		System.out.println("Accelarate with Electric engine");
	}

	@Override
	void brk() {
		// TODO Auto-generated method stub
		System.out.println("Tesla use regerative brk");
	}
}

class BMW extends Cars
{
	void accelarate()
	{
		System.out.println("Accelarate with fule");
	}
	void brk()
	{
		System.out.println("brk with normal way");
	}
	void start() 
	{
		System.out.println("Keys Start ");
	}
}