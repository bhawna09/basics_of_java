package array;

public class Average {

	public static void main(String[] args) {
       int arr[]= new int[4];
       
       arr[0]= 10;
       arr[1]=20;
       arr[2]=40;
       arr[3]=30;
       
       int sum =0;
       int length = arr.length;
       
       for(int i =0;i< length ; i ++)
       {
    	   sum = sum+ arr[i];
    	   
       }
       int avg = sum/length;
       
       System.out.println("Average is " + avg);

	}

}
