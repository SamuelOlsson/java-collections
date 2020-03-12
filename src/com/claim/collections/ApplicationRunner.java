package com.claim.collections;

import java.util.Scanner;

public class ApplicationRunner {

	public static void main(String[] args) {

		StudentRepository studentRepo = new StudentRepository();
		int choice = 1;

		
		do {
			Scanner in = new Scanner(System.in);
			System.out.println("1. Add Student");
			System.out.println("2. Print Students");
			System.out.println("3. Exit");
			System.out.print(": ");
			choice= in.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter Student: ");
				String student = in.next();
				studentRepo.addStudent(student);
			}
			else if(choice == 2) {
				studentRepo.printStudents();
			}
			
			System.out.println("/n/n");
		}while(choice != 3);

	}

}
