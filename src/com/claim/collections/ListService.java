package com.claim.collections;

import java.util.ArrayList;
import java.util.List;

public class ListService {

	//Cannot instantiate interface
	private List<String> classStudents;
	
	public ListService() {
		this.classStudents = new ArrayList<>();
	}
	
	public String findStudent(String studentName) {
		
		return null;
	}
	
	public void addStudent(String studentName) {
		classStudents.add(studentName);
	}
	
	public void printStudents() {
		for(String student : classStudents) {
			System.out.println(student);
		}
	}
	
}
