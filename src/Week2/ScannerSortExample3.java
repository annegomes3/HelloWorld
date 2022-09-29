package Week2;

import java.util.Arrays;

public class ScannerSortExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 8, 4, 5, 9, 11, 2, 7 };
		
		for ( int j = 1; j < a.length; j++ ) {
			
			
			int temp = a[j]; // value of the first element in the unsorted part of the array
			int possibleIndex = j; // index of the first element in the unsorted part of the array
			
			//         sorted | unsorted
			// 2 | 4 | 5 | 8 | 9 | 11 | 7
//			// 2 | 4 | 5 | 8 | 9 | 9 |11
//	-->		// 2 | 4 | 5 | 8 | 8 | 9 |11
//	-->		// 2 | 4 | 5 | 7 | 8 | 9 |11
			// 0  1  2  3  4  5  6
      //       ^		   
		  //possibleIndex |
		  //temp => 7
			      
			
			while ( possibleIndex>0 && temp < a[possibleIndex-1] ) {
				a[possibleIndex] = a[possibleIndex -1];
				possibleIndex--;
			}
			
			a[possibleIndex] = temp;
		}
			
		System.out.println(Arrays.toString(a));	
		// i, j, k
			
			
		   }
		
	}


