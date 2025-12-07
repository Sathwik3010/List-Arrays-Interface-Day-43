package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "dev", 20));
		studentList.add(new Student(2, "arjun", 30));
		studentList.add(new Student(3, "djr", 10));
		studentList.add(new Student(4, "dprebpvjixs", 40));

//		System.out.println(studentList);
		
		Iterator<Student>iterator = studentList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	
}
