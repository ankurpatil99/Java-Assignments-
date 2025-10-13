package encapsulation;

 class Employee {
	 
	 //Private variables (Data is Hidden)
	
	 private String name;
	 private int salary;
	 
	 //public getter and Setter method is created to access the data safely
	 
	 public String getname()
	 {
		 return name;
	 }
	 public void setname(String n)
	 {
		 if(n.isEmpty())
		 {
			 System.out.println("name can not be Empty");
		 }
		 else
		 {
			 this.name=n;
		 }
	 }
	 
	 public int  getsalary()
	 {
		 return salary;
	 }
	 
	 public void setsalary(int sal)
	 {
		 if(sal<0)
		 {
			 System.out.println("Salary Can not be Empty");
		 }
		 else
		 {
			 this.salary=sal;
			 
		 }
	 }

}
