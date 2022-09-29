package com.bptn.course;

public class NeettedConditional {

	public static void main(String[] args) {
		boolean morning = true;
		boolean sunny = true;
		
		if (morning) {
			System.out.println("Go for a run");
			if (sunny) {
				System.out.println("No need for coat on run");
			} else {
				System.out.println("Take your coat on the run");
			}
		} else {
			System.out.println("stay indoors");
		}
	}

	}


