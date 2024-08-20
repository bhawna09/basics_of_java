package array;

import java.util.Arrays;

public class Splitarray {

	public static void main(String[] args) {
		String name = "Tilak Raj Verma";
		
		String []a1=name.split(" ",2);
		String []a2 = name.split(" ");
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		
	}

}
