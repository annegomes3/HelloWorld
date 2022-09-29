package com.bptn.course;

public class ParlindromeExample {

	public static void main(String[] args) {
		
		
		int num= 424;// number to be checked for palindrome  
		int remainder = 0;
		int reverse=0;
		      
		  while(num>0){    
		   remainder=num%10;  //getting remainder  
		   reverse = (reverse*10)+remainder;    
		   num=num/10;    
		  }    
		  if(num==reverse)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  		

	}


