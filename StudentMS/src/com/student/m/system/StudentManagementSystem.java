package com.student.m.system;

import java.util.Scanner;


import com.student.m.system.StudentDao;
import com.student.m.system.StudentDaoInterface;

public class StudentManagementSystem {

	public static void main(String[] args) {
		int rollno;
		
		StudentDaoInterface dao =new StudentDao();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("*****Welcome to the Student Management System*****");
		while(true) {
			System.out.println("Press 1  Add Student ");
			System.out.println("Press 2 Show All Student ");
			System.out.println("Press 3 Show Student based on rollno ");
			System.out.println("Press 4 to Update Student ");
			System.out.println("Press 5 to Delete Student ");
			System.out.println("Press 6 Exit ");
			
			System.out.println("Enter Your Choice: ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Add Student");
			
				 System.out.println("Enter name:");
				 String name =sc.next();
				
				 
				System.out.println("Enter Course :");
				 String course=sc.next();
		
				System.out.println("Enter City: ");
				String city = sc.next();
				
				System.out.println("Enter attendance :");
				double attendance= sc.nextDouble();					
				Student st= new Student(name,course,city,attendance);
				boolean ans=dao.insertStudent(st);
				if(ans) {
					System.out.println("Record Inserted Successfully");
				}
				else
					System.out.println("Something Went Wrong Please Try Again..");
				break;
				
			case 2:
				System.out.println("Show All Student");
				dao.showallStudent();
				break;
			case 3:
				System.out.println("Show Student based on rollno");
				System.out.println("Enter roll number :");
			    rollno =sc.nextInt();
				boolean f =dao.showStudentByRollno(rollno);
				if(!f)
					System.out.println("Student with this roll no does not exist");
				else
					System.out.println("Student Record Details");

					
				break;
			case 4:
            	System.out.println("update student");
				System.out.println("\n1.Update name\n2.Update course");
				System.out.println("Enter your choice");
				int choice=sc.nextInt();
				if(choice==1) {
					System.out.println("enter roll number");
					rollno=sc.nextInt();
					System.out.println("Enter new name");
					String sname=sc.next();
					Student std=new Student();
					std.setName(sname);
					boolean flag =dao.update(rollno, sname, choice, std);
					if(flag)
						System.out.println("Name updated Successfully..");
					else
						System.out.println("Something went wrong.......");
				}
        		break;
				
			case 5:
				System.out.println("delete student");
				System.out.println("Enter rollno to delete the student record");
				rollno=sc.nextInt();
				boolean ff = dao.delete(rollno);
				if(ff)
					System.out.println("Record deleted successfully");
				else
					System.out.println("Something went wrong Please try again..");
				
				break;
			case 6:
				System.out.println(" Thank you for using Student Management System" );
				System.exit(0);
			default:
				System.out.println("Please enter valid choice");
			}

		}
		
		}
	}
				
			
		

