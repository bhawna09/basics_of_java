package basicprograms;

public class Method_Overloading {
	
	static void add() {
		System.out.println("hello");
	}

	
	static void add(int a) {
		System.out.println(a);
	}
	
	static void add(String a) {
		System.out.println(a);
	}
	
	static void add(String a ,char b,double c) {
		System.out.println(a + b+ c);   //concatenation for printing
	}

	public static void main(String[] args) {
		add();
		add(11);
		add("bhanu");
	    add("Suresh",'c',3.14);
		
	}

}
