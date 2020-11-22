package com.cjc.HomeController;

import java.util.Scanner;

import com.cjc.ServiceImplementation.Operation;

public class ServiceController {
	public static void main(String[] args) {
		Operation op = new Operation();
		while(true) {
			System.out.println("Class Management collection java project ");
			System.out.println("Class Management collection java project another sop ");
			System.out.println("Class Management collection java project another sop line 3 eclipse  ");
			System.out.println("1. Add course");
			System.out.println("2. Show course");
			System.out.println("3. Add Faculty");
			System.out.println("4. Show Faculty");
			System.out.println("5. Add Batch");
			System.out.println("6. Show Batch");
			System.out.println("7. Add Sudent");
			System.out.println("8. Show Student");
			System.out.println("9.Exit");
			Scanner sc = new  Scanner(System.in);
			int ch= sc.nextInt();
			
			switch(ch) {
			case 1: 
				op.addCourse();
				break;
			case 2: 
				op.showCourse();
				break;
			case 3:
				op.addFaculty();
				break;
			case 4:
				op.showFaculty();
				break;
			case 5:
				op.addBatch();
				break;
			case 6:
				op.showBatch();
				break;
			case 7:
				op.addStudent();
				break;
			case 8:
				op.showStudent();
				break;
			case 9:
				System.exit(-1);
				break;
			}
		}
	}
}
