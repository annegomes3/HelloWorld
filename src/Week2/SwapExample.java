package Week2;

import java.util.Scanner;

public class SwapExample {

	public static void main(String[] args) {
		// Example 2.1 in Coding Rooms
		int x;
		int y;
		int temp;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please input x: ");
		x = Integer.valueOf(scan.nextLine() );// can use next.Int but due to restriction in point 9 of coding room 2.1 have to convert string to int
		
		System.out.println("Please input y: ");
		y = Integer.valueOf( scan.nextLine() );
		
		
		
		System.out.println(" x value: " + x + " , y value: " + y);
		
		//Swapping using a temporary variable
		
		temp=x;
		x=y;
		y=temp;

		System.out.println(" x value: " + x + " , y value: " + y);

		
		
		

	}

}
