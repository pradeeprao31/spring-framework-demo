package com.springcore;

public class Student {
	
	
	private String StudentID;
	private String StudentName;
	private String StudentAddress;
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	public Student(String studentID, String studentName, String studentAddress) {
		super();
		StudentID = studentID;
		StudentName = studentName;
		StudentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [StudentID=" + StudentID + ", StudentName=" + StudentName + ", StudentAddress=" + StudentAddress
				+ "]";
	}

}
