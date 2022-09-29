package com.bptn.course;

public class StringExample {

	public static void main(String[] args) {
		
		String[] cars = {"Honda", "Volvo", "BMW"};

		// Access cars array to get Volvo

		String v = cars[1];
		String a = cars[2];
		System.out.println(v+" "+ a);
		int e = cars.length -1;
		System.out.println(cars[e]);
		
		
		
		String[] car = new String[3];
		car[0]= "Honda";
		car[1]= "Volvo";
		car[2]= "BMW";
		//int last = car.length-1; to print out last element
		//System.out.println(last); to print out last element
		
		System.out.println(car[1]);
		
		
		

	}

}
