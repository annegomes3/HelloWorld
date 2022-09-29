package com.bptn.course;

import java.util.Scanner;

public class ScannerExample1 {

	public static void main(String[] args) {
	Scanner name = new Scanner(System.in);
	System.out.println("Enter name");
	String x = name.nextLine();
	System.out.println(x);
	System.out.println("Enter integer");
	int y = name.nextInt();
	System.out.println(y);
	System.out.println("Enter decimal");
	float z = (float)name.nextFloat();
	System.out.println(z);
	
	
	

	}

}
