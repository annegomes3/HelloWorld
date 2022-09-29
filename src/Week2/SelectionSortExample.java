package Week2;

import java.util.Arrays;

public class SelectionSortExample {

	public static void main(String[] args) {
int[] a = { 8, 4, 5, 9, 11, 2, 7 };
		
		// First FOR LOOP
		for (int j=0; j<a.length-1; j++) { // a is the the name of the array above
			
			int minIndex = j; // Store the index of the minimum value (temporarily)
			
			// Second FOR LOOP
			for(int k=j+1; k<a.length; k++) { // k = j+1 because we are starting with comparing the first two elements: comparing element 1 (j) with elemnet 2 which is ( index i +1)
							
				if ( a[k] < a[minIndex] ) { //If the value at index K is smaller than the value at minIdex
					                        // This is the sign you change for sorting in ascending or descending order
					minIndex = k;
				}
			}
		   	
			// It’s time to swap values
			
			int temp = a[j]; // store the value at index j in a temp variable.
			
			a[j]= a[minIndex]; // replace the value at index j with the minimum number found
			
			a[minIndex] = temp; // replace the value at minIndex with the value in temp variable
						
		}
		
		System.out.println(Arrays.toString(a)); // Arrays is a built-in Java Library that comes with several utility
		                    // methods we can use with Arrays.
		
	}
}


