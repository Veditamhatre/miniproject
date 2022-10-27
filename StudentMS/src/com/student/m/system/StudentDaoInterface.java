package com.student.m.system;

public interface StudentDaoInterface {
	
	public boolean insertStudent(Student s);
	public void showallStudent();
	public boolean showStudentByRollno(int rollno);
	public boolean update(int rollno, String update, int ch, Student std);
	public boolean delete(int rollno);
	
	
	
	
}
