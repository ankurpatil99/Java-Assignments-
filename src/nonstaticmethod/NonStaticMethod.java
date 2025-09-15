package nonstaticmethod;

public class NonStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// here we are creating new object as its non Static  Method (NonStatMethodPR,nonStaticMenthodPB) they dont have thier own space so we are creating space for that Method
		NonStaticMethod NSM=new NonStaticMethod();
		NSM.NonStatMethodPR();
		NSM.nonStaticMenthodPB();
	}
	private void NonStatMethodPR()// i am using the \n to print the test on new line
	{
		System.out.println("This is a non Static method"+"\n"+"Created by Ankur");
	}
	
	public void nonStaticMenthodPB()//i am using the \t to print the text and give the tab i.e space between two words 
	{
		System.out.println("This is non public non Static method"+"\t"+"Accessed out of the parent class");
	}

}
