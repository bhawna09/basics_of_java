package basicprograms;

public class GlobalVariable {
	
	double pi; // global variable
	static int no_of_days_leap_year = 366;
	static int age ;    //default value is 0
	boolean value;

	public static void main(String[] args) {
		
	System.out.println(age);

GlobalVariable g1= new GlobalVariable();
g1.pi = 100;   //updating non-static global variable
System.out.println(g1.pi);
System.out.println(g1.value);
System.out.println(no_of_days_leap_year);
	}
	

}
