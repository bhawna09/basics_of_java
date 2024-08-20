package array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= new int[4];
		arr[0]=100;
		arr[1]=200;
        arr[2]=300;
        arr[3]=400;
        
        int Rev_arr[]= new int[4];
        
       /* Rev_Arr[3]=arr[0];
        Rev_Arr[2]=arr[1];
        Rev_Arr[1]=arr[2];
        Rev_Arr[0]=arr[3];*/
        
        for(int i=0,k=3; i<arr.length;i++)

        {
        	Rev_arr[k]=arr[i];
        	k--;
        }
        
        
    System.out.println(Arrays.toString(arr));
        
System.out.println(Arrays.toString(Rev_arr));
	}
}

/* i=0;
 * rev[3] =400
 * i=1;
 * rev[2]=300
 * i=2;
 * rev[1]=200
 * i=3
 * rev[0]=100*/

