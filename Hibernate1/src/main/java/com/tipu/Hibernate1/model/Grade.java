package com.tipu.Hibernate1.model;

import javax.persistence.Entity;

@Entity
public class Grade {
	private long id;
	private Student student;
	private Course course;
	private String grade;
	
	public Grade() {
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Grade [id=" + id + ", student=" + student + ", course=" + course + ", grade=" + grade + "]";
	}
}
