package basicprograms;

public class Constructor {                                //same name as classname
	
	  Constructor() {                                     //this is constructor
		                                                  //doesn't have return type
		System.out.println("this is constructor");       
	}
	  
	   Constructor(String message) {
		  System.out.println(message);
	  }

	public static void main(String[] args) {
		
		 new Constructor();
		 new Constructor("my name is bhawna");
		// or
		// Constructor c1=new Constructor();

	}

}
