package com.bptn.course;

public class Array2 {

	public static void main(String[] args) {
		//<data type>[] <variable name> = new <data type>[<size of array>];
        int[] nums = new int[5];
        nums[0] = 5;
        nums[1] = 2;
        nums[2] = 6;
        nums[3] = 2;
        nums[4] = 6;
      //
        // gets the index of last element (n-1)
        int n = nums.length - 1;
        System.out.println("Element at " + n +" index is " + nums[n]);
        n = n - 1;
        System.out.println("Element at " + n +" index is " + nums[n]);
        n = n - 1;
        System.out.println("Element at " + n +" index is " + nums[n]);
        n = n - 1;
        System.out.println("Element at " + n +" index is " + nums[n]);
        n = n - 1;
        System.out.println("Element at " + n +" index is " + nums[n]);
        n = n - 1;//<data type>[] <variable name> = new <data type>[<size of array>];
        

	}

}
