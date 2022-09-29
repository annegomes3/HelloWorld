package com.bptn.course;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		Scanner patient = new Scanner(System.in);
		System.out.println("What is your name: ");
		String a = patient.nextLine();
		System.out.println(a);
		System.out.println("What is your race");
		String b = patient.nextLine();
		System.out.println(b);
		System.out.println("What is your weight");
		Double c = patient.nextDouble();
		System.out.println(c);
		System.out.println("What is your salary");
		Double d = patient.nextDouble();
		System.out.println(d);
		
		
		
	
		
	System.out.println("Name: "+ a + "; Race: " + b + "; Weight: "+ c + "; Salary: "+ d);
	
		

	}

}
