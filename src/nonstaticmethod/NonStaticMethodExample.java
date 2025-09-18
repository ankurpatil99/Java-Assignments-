package nonstaticmethod;

public class NonStaticMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//we are creating the new object for non Static method to access it from the Out side of the class as it don't have their own space created		
			NonStaticMethod NSPB=new NonStaticMethod();
			NSPB.nonStaticMenthodPB();// It is Public Static method form NonStaticMethod class and it can be accessed outside of the Class
			
			//NSPB.NonStatMethodPR();//Not able to Access this method as it is Private method from NonStaticMethod Class 
			
	}

}
