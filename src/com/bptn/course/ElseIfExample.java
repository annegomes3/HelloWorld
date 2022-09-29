package com.bptn.course;

public class ElseIfExample {

	public static void main(String[] args) {
		int score = 45;
	
		if (score >= 80) {
			System.out.println("A");
		} else if (score >= 70) {
			System.out.println("B");
		} else if (score >= 60){
			System.out.println("C");
		} else if (score >= 50){
			System.out.println("D");
		} else {
			System.out.println("failed");
		}

	}

}
