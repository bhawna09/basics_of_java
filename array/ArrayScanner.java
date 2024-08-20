package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {

		int Arr[]= new int [3];
		Scanner s1 = new Scanner(System.in);
		System.out.println("please enter the array values");
		for(int i=0; i<Arr.length;i++) {
			
		Arr[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(Arr));
		
		String name[] = new String[3];
		
		System.out.println("please enter the string values");
		
		for(int i =0;i<name.length;i++) {
		name[i]=s1.next();
		
		}
		System.out.println(Arrays.toString(name));
	
		
		double salary[] = new double[3];
	
		
		System.out.println("please enter the double values");
		
		for(int i =0;i<salary.length;i++) {
		salary[i]=s1.nextDouble();
		
		}
		System.out.println(Arrays.toString(salary));
		s1.close();
	}

}