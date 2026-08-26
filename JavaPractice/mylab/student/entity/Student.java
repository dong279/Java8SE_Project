package mylab.student.entity;

import mylab.student.exception.InvalidGradeException;

public class Student {
	private String studentId;
	private String name;
	private String major;
	private int grade;
	
	public Student (String studentId, String name, String major, int grade) throws InvalidGradeException{
		this.studentId = studentId;
		this.name = name;
		this.major = major;
//		this.grade =grade;
		setGrade(grade);
	}
	
	public Student (String name, String major, int grade) throws InvalidGradeException{
		this.name = name;
		this.major = major;
//		this.grade = grade;
		setGrade(grade);
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMajor() {
		return major;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setGrade(int grade) throws InvalidGradeException {
	    if (grade < 1 || grade > 4) {
	        throw new InvalidGradeException("학년은 1~4 사이의 값이어야 합니다.");
	    }
	    this.grade = grade;
	}
	
	
}
