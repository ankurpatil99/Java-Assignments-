package constructors;

class employee{
	
		String name;
		int id;
	
employee()
{
	//No Argument constructor as we have not passed any argument in the constructor while defining
	name="Ankur";
	id=10;
}
}

public class NoArgumentConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			employee em=new employee();//Constructor  is called 
			System.out.println("Employee name "+em.name);
			System.out.println("ID is "+em.id);
	}

}
