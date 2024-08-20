package basicprograms;

public class Method_Ovrloading_NonStatic {
	
	void add() {
		System.out.println("1");     //non-static
	}
	
    void add(int a) {
		System.out.println("2");
	}
    
    void add(String a) {
		System.out.println("3");
	}
    
    void add(String a ,char b,double c) {
		System.out.println("4");
	}
    
    static void add(boolean a) {
    	System.out.println("a");    //static 
    }


	public static void main(String[] args) {
		Method_Ovrloading_NonStatic d1 = new Method_Ovrloading_NonStatic();
		d1.add();
		d1.add(56);
		d1.add("MKT");
		d1.add("bhanu",'b',3.14);
		add(true);
	}

}
