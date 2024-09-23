package com.user.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.user.bean.*;

public class ContactusDBUtil {


private static boolean isSuccess;
	
	private static ResultSet rs=null;
	
	private String url ="jdbc:mysql://localhost:3306/Careone?useSSL=false";
	 private String userName = "root";
	 private String password = "Kajanthan@8555";
	 private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	 
	 private static final String insertcontactus="INSERT INTO contactus"+"(Name,Email,Message,Subject,RID)VALUES" + "(?,?,?,?,?) ;";
	
	 
	 
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
	
		public boolean contactus(String Name,String Email,String Message,String Subject,int RID) {
		System.out.println(Name);
		System.out.println(Email);
		System.out.println(Message);
		System.out.println(Subject);
		
		boolean isSuccess = false;
		
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(insertcontactus)){
			
                 System.out.println(con);
                 
			preparedStatement.setString(1,Name);
			preparedStatement.setString(2,Email);
			preparedStatement.setString(3,Message);
			preparedStatement.setString(4,Subject);
			preparedStatement.setInt(5,RID);
			
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


	public static List<Contactus> getContactusList(){
    	
  	  
  	  List<Contactus> CList=new ArrayList<Contactus>();
  	  
  	  //create DB connection
  	  String url ="jdbc:mysql://localhost:3306/Careone?useSSL=false";
		  String user ="root";
		  String pass ="Kajanthan@8555";
		  
		  
		
		  try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			String sql="select * from contactus";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int CID=rs.getInt("CID");
				String Name=rs.getString("Name");
				String Email= rs.getString("Email");
				String Message= rs.getString("Message");
				int RID=rs.getInt("RID");
				String Subject= rs.getString("Subject");
				
				
				CList.add(new Contactus(CID,Name,Email,Message,RID,Subject));
				
				}
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  return CList;
		  
    }
    
    public static void deleteContactus(int CID) {
  	  String url ="jdbc:mysql://localhost:3306/Careone?useSSL=false";
		  String user ="root";
		  String pass ="Kajanthan@8555";
		  
		  
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			String sql="delete from contactus where CID ="+CID+";";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
    }
    
    public static void updateContactus( int CID,String Name,String Email,String Message,String Subject) {
  	  String url ="jdbc:mysql://localhost:3306/Careone?useSSL=false";
		  String user ="root";
		  String pass ="Kajanthan@8555";
		  
		  
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			String sql="update contactus set Name='"+Name+"',Email='"+Email+"',Message='"+Message+"',Subject='"+Subject+"'where CID='"+CID+"';";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
    }

	
    
}
