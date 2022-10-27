package com.student.m.system;

public class Student {
	private int rollno;
	private String name;
	private String course;
	private String city;
	private double attendance;
	
     Student (){
		
	}
     public Student(String name, String course, String city, double attendance) {
 		super();
 		this.name = name;
 		this.course = course;
 		this.city = city;
 		this.attendance = attendance;
 	}
 	

	public Student(int rollno, String name, String course, String city, double attendance) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.city = city;
		this.attendance = attendance;
	}
	

	public int getRollno() {
		return rollno;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public double getAttendance() {
		return attendance;
	}
	
	public void setAttendance(double attendance) {
		this.attendance = attendance;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", course=" + course + ", city=" + city
				+ ", attendance=" + attendance + "]";
	}
	
}
	