package array;

import java.util.Arrays;

public class Arrayupdate {

	public static void main(String[] args) {
		int [] roll_no = new int[4];
		roll_no[0] = 4;
		roll_no[1] = 10;
		roll_no[2] = 15;
		
		for (int i =0;i<=3;i++) {
				
	      System.out.println(roll_no[i]);
	    }
		
		String name[]= new String[3];
		name[0]="bhawna";
		name[0]="manish";         //value is updated at 0 index and on 1 null will be printed.
		name[2]="rohit";
		
		System.out.println(Arrays.toString(name));

	}

}
