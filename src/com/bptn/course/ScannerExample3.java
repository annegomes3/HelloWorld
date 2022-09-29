package com.bptn.course;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		Scanner nums = new Scanner(System.in);// Scanner variable = new Scanner(System.in)
		System.out.println("Enter a number");
		int a = nums.nextInt(); // type variable = above variable.input type (from table)
		if (a> 0) {
			System.out.println("Positive");
		}else if (a<0) {
			System.out.println("Negative");
		} else
			System.out.println("Equal to zero");
		}
		
		
		

	}


