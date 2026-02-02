package com.ktdsuniversity.edu.generics.collection.list.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
	
	public static void printStudents(
			Map<Integer, List<Student>> classes,
			int classNum) {
		List<Student> students = classes.get(classNum);
		
		if(students != null) {
			for (Student student : students) {
				System.out.println(classNum +"반의 학생" + student);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Map<Integer, List<Student>> classes = new HashMap<>();
		
		classes.put(1, new ArrayList<>());
		classes.put(2, new ArrayList<>());
		
		
		List<Student> studens = classes.get(1); // 1을 
		studens.add(new Student(1, "김범수") );
		studens.add(new Student(2, "나얼") );
		studens.add(new Student(3, "박효신") );
		studens.add(new Student(4, "이수") );
		
		
		
		printStudents(classes, 0);
		printStudents(classes, 1);
		printStudents(classes, 2);
		printStudents(classes, 3);
		
		
	}
}
