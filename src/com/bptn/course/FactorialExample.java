package com.bptn.course;

public class FactorialExample {

	public static void main(String[] args) {
	    int num = 4;
	    int factorial = 1;
	    
	    for(int i=num; i>0; i--) 
	    {
	         factorial = factorial * i; //starts of with factorial 1 so 1*4=4. factorial now becomes 4 and we are decreasing i in incraments of 1 so it now becomes 4x3 =12..and so on until we reach 24x1= 24 
	    }

	    System.out.println("Factorial is: "+factorial);   

	}

}
