package basicprograms;

public class LocalVariable {
	
	static void add() 
	{
		int age = 18;
		System.out.println(age);
	}
	
	void sub()
	{
		double pi=3.14;                //non-static method
		System.out.println(pi);
	}

	LocalVariable()
	{
	  String name="bhawna";
	  System.out.println(name);
	}
	public static void main(String[] args) {
	add();
	LocalVariable l1= new LocalVariable(); //calling constructor
	l1.sub();    //calling non-static method

	}

}
