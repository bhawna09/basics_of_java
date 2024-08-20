package basicprograms;

public class Static_Method {
	
	static void addition() {
		System.out.println("I am addition method");
	}
	
	static void multiply() {
		System.out.println("I am multiply method");
	}
    
	static void market() {
		System.out.println("market is open today");
	}
	public static void main(String[] args) {
		System.out.println("Bhawna Verma");
		addition();      //we can call static method directly by their name only
		multiply();
		market();
	}

}
