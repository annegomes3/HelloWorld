package Week2;

import java.util.Arrays;

public class InsertionSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = { 8, 4, 5, 9, 11, 2, 7 };
		
		for ( int j = 1; j < a.length; j++ ) {
			
			
			int temp = a[j]; // value of the first element in the unsorted part of the array
			int possibleIndex = j; // index of the first element in the unsorted part of the array
			
			//                 sorted | unsorted     sample from original array. assuming iterration has started, this is a sample from iterration 6. so temp is cuurenlty the value of 7 (here we want to order 7 in the right position)
			// 2 | 4 | 5 | 8 | 9 | 11| 7            looking a while, possible index is 6 >0. a[possibleIndex]-1 = 11(value .index 5). is temp<less than a[possibleIndex-1]? so is 7? yes
//			// 2 | 4 | 5 | 8 | 9 | 9 |11            so we set a[possibleIndex] = the value of the prev index ( a[possibleIndex -1] hence the double 9. This is repeated till we find the right place for 7
//	-->		// 2 | 4 | 5 | 8 | 8 | 9 |11
//	-->		// 2 | 4 | 5 | 7 | 8 | 9 |11
			// 0   1   2   3   4   5  6
      //                              ^		   
		  //possibleIndex |
		  //temp => 7
			      
			
			while ( possibleIndex>0 && temp < a[possibleIndex-1] ) { //
				a[possibleIndex] = a[possibleIndex -1]; // copying value from right side to the left side
				possibleIndex--;
			}
			
			a[possibleIndex] = temp;
		}
			
		System.out.println(Arrays.toString(a));	
		// i, j, k
			
			
	
	}

}
