package Week2;

public class LinearSequentialSearch {

	public static void main(String[] args) {
		int key = 6; // initialize key
		int ind = -1; // if you don't find value (key) in array, then to return -1. Any number can be used, but -1 common
		
		int[] a = { 3, 8, 4, 2, 12, 6};  //create array
		
		for (int i = 0; i<a.length; i++) {
		
		//need if statement to compare if key is equivalent to element in array
		
		if (key == a[i]) {
			ind=i;
			break; // breaks out from the loop
		}
		
		}
		System.out.println("Index :" + ind);
		
		
		
		
		
		
		

	}

	}
	

