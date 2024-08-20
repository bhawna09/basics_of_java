package basicprograms;

public class Amazon {
	
	Amazon(){
		System.out.println("this is amazon constructor");
	}
	
	Amazon(int a){
		System.out.println("this is amazon constructor with parameter");
	}
	
	Amazon(int a ,double b){
		System.out.println("with 2 paramtere");
	}
	
	void add() {
		System.out.println("non-static");
	}

	public static void main(String[] args) {
		
		new Amazon();
		new Amazon(1);
		
		Amazon a1 = new Amazon(19,3.14);
		a1.add();
		
	
	}

}
