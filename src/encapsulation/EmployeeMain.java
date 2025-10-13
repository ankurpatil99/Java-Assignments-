package encapsulation;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
		
		//Accessing Private variable  using public methods
		emp.setname("Rahul");
		emp.setsalary(40000);
		
		System.out.println("Employee Name "+emp.getname());
		System.out.println("Employee Salary "+emp.getsalary());
		
	}

}
