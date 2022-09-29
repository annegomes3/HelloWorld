package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerSortExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     
	    /*
	    Write the sort function below which takes an integer array and performs insertion sort on that.
	    Check the main function on how the function is being called. 
	    */

	    
	 
	        //System.out.println("Enter the numbers to be sorted");

	        // fill in the missing code below to take the user input for 10 numbers and store the elements in the array called arr
	      int maxLimit, i, j, temp;
			
			Scanner scan = new Scanner(System.in);		
			System.out.print("Please Enter the Array size = ");
			maxLimit = scan.nextInt();
			
			int[] arr = new int[maxLimit];
			
			System.out.format("Enter Array elements = ", maxLimit);
			for(i = 0; i < maxLimit; i++) {
				arr[i] = scan.nextInt();
			}
			
			for(i = 0; i < arr.length  - 1; i++)
			{
				int min = i;
				
				for(j = i + 1; j < arr.length; j++)
				{
					if(arr[j] < arr[min])
					{
						min = j;
					}
				}
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
				
			}
			System.out.print("The new sorted array is = ");
			for(i = 0; i < arr.length; i++) 
			{
				System.out.print(arr[i] + "  ");
	        // Test the code on the following input
	        // input = 4 1 10 -3 12 12 4 2 6 8
	        
	       


	       // Do not modify the code below
	       //sort(arr);
	       //for (int n : arr) {
	           //System.out.print(n + " ");
	       }
	   }
	        

	    
	}

	
	   


