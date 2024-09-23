package com.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.user.bean.*;
import java.sql.Date;


public class AppointmentDBUtil {

private static ResultSet rs=null;
	
	private String url ="jdbc:mysql://localhost:3306/Careone?useSSL=false";
	 private String userName = "root";
	 private String password = "Kajanthan@8555";
	 private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	 
	 private static final String insertappointment="INSERT INTO contactus"+"(Name,Email,Phone,Message,Date,Department,RID)VALUES" + "(?,?,?,?,?,?,?) ;";
	
	 
	 
	protected Connection getConnection() {
		Connection connection = null;
		
		try {
			Class.forName(jdbcDriver);
			connection = DriverManager.getConnection(url,userName,password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
		public boolean appointment(String Name,String Email, String Phone,String Message,LocalDate Date,String Department,int RID) {
			LocalDate localDate = LocalDate.now(); 
            java.sql.Date sqlDate =java.sql.Date.valueOf(localDate);
			
			
		System.out.println(Name);
		System.out.println(Email);
		System.out.println(Phone);
		System.out.println(Message);
		System.out.println(Date);
		System.out.println(Department);
		System.out.println(RID);
		
		boolean isSuccess = false;
		
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(insertappointment)){
			
                 System.out.println(con);
                 
			preparedStatement.setString(1,Name);
			preparedStatement.setString(2,Email);
			preparedStatement.setString(3,Phone);
			preparedStatement.setString(3,Message);
			preparedStatement.setDate(4,sqlDate);
			preparedStatement.setString(5,Department);
			preparedStatement.setInt(4,RID);
			
			
			System.out.println(preparedStatement);
			
			int rs = preparedStatement.executeUpdate();
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(isSuccess);
		return isSuccess;
	}
	      
	      public static List<Appointment> getAppointmentList(){
	    	
	    	  
	    	  List<Appointment> AList=new ArrayList<Appointment>();
	    	  
	    	  //create DB connection
	    	  String url ="jdbc:mysql://localhost:3306/Careone?useSSL=false";
	  		  String user ="root";
	  		  String pass ="Kajanthan@8555";
	  		  
	  		  
			
	  		  try {
	  			Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, user, pass);
				String sql="select * from appointment";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int AID=rs.getInt("AID");
					String Name=rs.getString("Name");
					String Email= rs.getString("Email");
					String Phone= rs.getString("Phone");
					String Message= rs.getString("Message");
					int RID=rs.getInt("RID");
					LocalDate Date= rs.getDate("Date").toLocalDate();
					String Department=rs.getString("Department");
					
					AList.add(new Appointment(AID,Name,Email,Phone,Message,RID,Date,Department));
					
					}
				
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  		  
	  		  return AList;
	  		  
	      }
	      
	      public static void deleteAppointment(int AID) {
	    	  String url ="jdbc:mysql://localhost:3306/Careone?useSSL=false";
	  		  String user ="root";
	  		  String pass ="Kajanthan@8555";
	  		  
	  		  
	  		try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, user, pass);
				String sql="delete from appointment where AID ="+AID+";";
				Statement stmt = con.createStatement();
				stmt.executeUpdate(sql);
				
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			
	      }
	      
	      public static void updateAppointment( int AID,String Name,String Email,String Phone,String Message,LocalDate Date,String Department) {
	    	  String url ="jdbc:mysql://localhost:3306/Careone?useSSL=false";
	  		  String user ="root";
	  		  String pass ="Kajanthan@8555";
	  		  
	  		  
	  		try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, user, pass);
				String sql="update appointment set Name='"+Name+"',Email='"+Email+"',Phone='"+Phone+"',Message='"+Message+"',Date='"+Date+"',Department='"+Department+"' where AID='"+AID+"' ;";
				Statement stmt = con.createStatement();
				stmt.executeUpdate(sql);
				
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			
	      }
	      
	      
	      
	}

