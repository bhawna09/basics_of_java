package basicprograms;

public class Non_StaticMethod {
	
	 void add() {                     //non-static method
		int a =20;
		int b = 10;
		int sum = a+b;
		System.out.println(sum);
	}
	  void mul() {                     //non-static method
			int a =20;
			int b = 10;
			int mul = a+b;
			System.out.println(mul);
		}
	 static void sub() {
	 int c= 30;
	 int d =20;
	 int minus = c-d;
	 System.out.println(minus);
	 }
    public static void main(String[] args) {
		
		//by creating an object with the help of reference
		Non_StaticMethod n1 = new Non_StaticMethod();
		n1.add();  //calling the object with method name
		n1.mul();
		sub(); //calling static method
	}

}
