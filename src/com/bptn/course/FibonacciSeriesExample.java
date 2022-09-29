package com.bptn.course;

import java.util.Scanner;

public class FibonacciSeriesExample {

	public static void main(String[] args) {
		// taken from coding 1.8 in coding rooms
		  int num1 = 0;
	        int num2 = 1;
	       
	       Scanner fibonacci = new Scanner(System.in);
	       System.out.print("Enter n");
	       
	       int n = fibonacci.nextInt();
	       
	       System.out.print(num1);
	       System.out.print(", ");
	       System.out.print(num2);
	       
	       
	       for(int i = 1; i<=n; i++) {
	    	 int num3 = num1 + num2;
	        System.out.print(", "+ num2);
	        num1 = num2;
	        num2 = num3;

	        
	       }
		}
	}
