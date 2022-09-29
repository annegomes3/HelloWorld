package com.bptn.course;

public class SwapNumbersExample1 {

	public static void main(String[] args) {
		int h = 3;
	     int w = 5;
	     System.out.println(h);  //3
	     System.out.println(w);  //5

	     System.out.println("before changes h = " + h + " and w = " + w); 
	     h = w + h;
	     w = h - w;
	     h = h - w;
	     System.out.println("after changes h = " + h + " and w = " + w);
        // OR
			//int h = 3;
		   // int w = 5;
	        //int temp = 0;
		    // System.out.println("before changes h = " + h + " and w = " + w);
	        // System.out.println(h);  //3
		    // System.out.println(w);  //5

		    // temp = h;
		    // h = w;
		    // w = temp;

		     // System.out.println("after changes h = " + h + " and w = " + w);
	         //System.out.println(h); //5
		    // System.out.println(w); //3
	}

}
