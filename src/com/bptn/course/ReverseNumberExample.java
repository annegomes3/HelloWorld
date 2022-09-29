package com.bptn.course;

public class ReverseNumberExample {

	public static void main(String[] args) {
		int num = 6349; // Decimal System
		int reverse = 0;
		int remainder = 0;
		
		while ( num!=0 ) {
			
			remainder = num % 10; // Grab the last digit of the number
			reverse = (reverse * 10) + remainder; // Append the last digit to the reverse number
      num = num / 10; // Remove the last digit of the number
		}
		
		System.out.println("The reversed number is: " + reverse);
	}

}
