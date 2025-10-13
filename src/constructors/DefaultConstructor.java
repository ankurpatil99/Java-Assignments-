package constructors;


class Car
{
	//default constructor is created 
	String Brand;
	int Speed;
}

public class DefaultConstructor {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car cr=new Car();//default Constructor is called.
		System.out.println("Brnad is "+cr.Brand); 
		System.out.println("Speed is "+cr.Speed);
	}

}
