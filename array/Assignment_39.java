package array;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_39 {

	public static void main(String[] args) {
		int Arr[]= new int[4];
		Arr[0]=100;
		Arr[1]=200;
        Arr[2]=300;
        Arr[3]=400;
        
        System.out.println(Arrays.toString(Arr));
        
        Scanner s1 = new Scanner(System.in);
        
                  int givennumber= s1.nextInt();
                  System.out.println(givennumber);
                  
                  for(int i=0;i<Arr.length;i++)
                  {
                  if(givennumber==Arr[i]) {
                	  
                	  System.out.println("It is part of array at index " + i);
                  }
                  else
                  {
                	  System.out.println("not part of Array");
                  }
	}
                  s1.close();
	}

}
