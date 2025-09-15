package com.mycompany.csc229_211review_lab02hw;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {

	public static void main(String[] args) {

		int gpa;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter your GPA");         // This Block gets data from user
		gpa = scnr.nextInt();

		Student sam = new Student(gpa,"oak lane","Sam",(short) 10);
		// Using GPA from User Input

		System.out.println(sam.getGpa());



	}

}
