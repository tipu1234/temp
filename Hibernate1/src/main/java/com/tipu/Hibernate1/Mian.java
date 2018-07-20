package com.tipu.Hibernate1;

import com.tipu.Hibernate1.model.Course;
import com.tipu.Hibernate1.model.Grade;
import com.tipu.Hibernate1.model.Student;

public class Mian {
	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setStudentName("Serdar");
		Course course = new Course();
		course.setId(1);
		course.setCourseName("Math");
		Grade grade = new Grade();
		grade.setId(1);
		grade.setStudent(student);
		grade.setCourse(course);
		grade.setGrade("AAA");
		
		System.out.println("Grdae: "+grade);
	}
}
