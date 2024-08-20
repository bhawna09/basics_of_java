package array;

import java.util.Arrays;

public class Arrayequal {

	public static void main(String[] args) {
	
		int rollno []= new int[4];
		rollno[0]=21;
		rollno[1]=45;
		rollno[2]=30;
		rollno[3]=67;
		
		int rollno1[]= new int[4];
		rollno1[0]=21;
		rollno1[1]=45;
		rollno1[2]=30;
		rollno1[3]=67;
		
		boolean ans= Arrays.equals(rollno, rollno1);
		
		System.out.println(ans);
		
	
	}

}
