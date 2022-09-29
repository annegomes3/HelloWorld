package Week2;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int maxLimit, i, j, temp;
		
		Scanner scan = new Scanner(System.in);		
		System.out.print("Please Enter the Array size = ");
		maxLimit = scan.nextInt();
		
		int[] arr = new int[maxLimit];
		
		System.out.format("Enter Array %d elements = ", maxLimit);
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
		}
	}

        
	  
	    
	    
	}
	

	


