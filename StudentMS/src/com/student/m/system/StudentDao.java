package com.student.m.system;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;




public class StudentDao implements StudentDaoInterface{

	@Override
	public boolean insertStudent(Student s) {
		boolean flag=false;
		 try{
		 Connection con=DBConnection.createDBConnection();
	     String query = "insert into studentms (name,course,city,attendance)values (?,?,?,?)";
	   
	    	 PreparedStatement pst = con.prepareStatement(query);
	    	
	    	 pst.setString(1,s.getName());
	    	 pst.setString(2,s.getCourse());
	    	 pst.setString(3,s.getCity());
	    	 pst.setDouble(4, s.getAttendance());
			 pst.executeUpdate();
			 flag=true;
			 
			
	    	 
	    }catch(Exception ex) {
	    	ex.printStackTrace();
	    }
		return flag;
		
	}
	@Override
	public void showallStudent() {
	try {
		Connection con=DBConnection.createDBConnection();
		String query="select  * from studentms";
	    Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println("Roll number: "+rs.getInt(1)+"\nName:"+rs.getString(2)+"\ncourse:"+rs.getString(3)+"\nCity:"+rs.getString(4)+"\nAttendance:"+rs.getDouble(5));
		    System.out.println("---------------------------------------------------------------------------------------------");
		}
		
		
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
		
	}

	@Override
	public boolean showStudentByRollno(int rollno) {
		try {
			Connection con=DBConnection.createDBConnection();
			String query="select  * from studentms where  rollno="+rollno;
		    Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println("Roll number: "+rs.getInt(1)+"\nName:"+rs.getString(2)+"\ncourse:"+rs.getString(3)+"\nCity:"+rs.getString(4)+"\nAttendance:"+rs.getDouble(5));
			  //  System.out.println("---------------------------------------------------------------------------------------------");
			}
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
			
		}
	
	@Override
	public boolean update(int rollno, String update, int ch, Student s) {
		int choice=ch;
		boolean flag=false;
		try {
			if(choice==1) {
				Connection con=DBConnection.createDBConnection();
				String query="update studentms set name=? where rollno=?";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1,update);
				ps.setInt(2, rollno);
				ps.executeUpdate();
				flag=true;
				
			}
		
		 }catch(Exception ex) {
		    	ex.printStackTrace();
		    }
		return flag;
			

	
	
	}

	


	
	@Override
	public boolean delete(int rollno) {
		boolean flag=false;
		try {
			Connection con=DBConnection.createDBConnection();
			String query="select  from studentms where rollno"+rollno;
			 PreparedStatement pst = con.prepareStatement(query);
			 flag=true;
		}

		catch(Exception ex) {
			ex.printStackTrace();
		}
		return flag;
	}
	
}