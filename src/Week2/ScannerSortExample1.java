package Week2;

import java.util.Scanner;

public class ScannerSortExample1 {

	public static void main(String[] args) {
	    // For loop
		
		int k, i, j, element;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Size of Array: ");
	      k = scan.nextInt();
	      int[] arr = new int[k];
	      System.out.print("Enter " +k+ " Elements: ");
	      for(i=0; i<k; i++)
	         arr[i] = scan.nextInt();
	      
	      for(i=1; i<k; i++)
	      {
	         element = arr[i];
	        
	         
	         for(j=(i-1); j>=0 && arr[j]>element; j--)
	            arr[j+1] = arr[j];
	         
	         arr[j+1] = element;
	      }
	      
	      System.out.println("\nThe new sorted array is: ");
	      for(i=0; i<k; i++)
	         System.out.print(arr[i]+ " ");


	}
	    
	}
	

