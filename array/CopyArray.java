package array;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {

      double Esalary[]= new double[4];
      Esalary[0] = 67889.34;
      Esalary[1] = 3456.67;
      Esalary[2] = 3456.67;
     
     double Msalary[] = new double[4];
      
      for (int i = 0 ; i <Esalary.length; i++)
      {
      
      Msalary[i] = Esalary[i];
     

	}
      System.out.println(Arrays.toString(Msalary));

     }
	}
