package constructors;

class student
{
	String Name;
	int rollno;
	
	//Parameterised constructor
	student (int rn,String nm)
	{
		Name=nm;
		rollno=rn;
		
	}
	void display()
	{
		System.out.println("Name :"+Name +" Roll No  "+rollno);
	}
}

public class ParameterisedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student st1=new student(101,"Ankur");//called Constructor with passing the parameter
		student st2=new student(102,"Rohan");
		
		st1.display();
		st2.display();
		

	}

}
