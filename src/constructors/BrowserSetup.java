package constructors;

  class BrowserSetup {
	
	//No Arguments Constructor
	  BrowserSetup() {
		 System.out.println("Default Constructor ");
	
	}
	  
	  //Parameterised Constructor with 1 Argument
	  BrowserSetup(String browsername)
	  {
		  System.out.println("launching Browser "+browsername);
	  }
	  
	  //parameterised constructor with multiple argument 
	  BrowserSetup(String browsername,String URL)
	  {
		  System.out.println("launchin Browser "+browsername);
		  System.out.println("Broser URL is "+URL);
	  }

}
