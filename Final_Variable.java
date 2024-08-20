package basicprograms;

public class Final_Variable {
	
	 final double pi =3.14;
	
	    void areaofcircle() {
		final int r = 10;
		double area= pi*r*r;
		
		System.out.println(area);
	}

	public static void main(String[] args) {
		
		Final_Variable f1 = new Final_Variable();
		
	    f1.areaofcircle();
		
	}

}
