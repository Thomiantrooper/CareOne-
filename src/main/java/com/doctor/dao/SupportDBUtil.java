package com.doctor.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.doctor.bean.support;


public class SupportDBUtil {
private static ResultSet rs=null;
	
	private String url ="jdbc:mysql://localhost:3306/Careone?useSSL=false";
	 private String userName = "root";
	 private String password = "Kajanthan@8555";
	 private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	 
	 private static final String insertsupport="INSERT INTO support"+"(Name,Email,Message,Subject,DID)VALUES" + "(?,?,?,?,?) ;";
	
	 
	 
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
	
		public boolean support(String Name,String Email,String Message,String Subject,int DID) {
		System.out.println(Name);
		System.out.println(Email);
		System.out.println(Message);
		System.out.println(Subject);
		
		boolean isSuccess = false;
		
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(insertsupport)){
			
                 System.out.println(con);
                 
			preparedStatement.setString(1,Name);
			preparedStatement.setString(2,Email);
			preparedStatement.setString(3,Message);
			preparedStatement.setString(4,Subject);
			preparedStatement.setInt(5,DID);
			
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
      
      public static List<support> getSupportList(){
    	
    	  
    	  List<support> SList=new ArrayList<support>();
    	  
    	  //create DB connection
    	  String url ="jdbc:mysql://localhost:3306/Careone?useSSL=false";
  		  String user ="root";
  		  String pass ="Kajanthan@8555";
  		  
  		  
		
  		  try {
  			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			String sql="select * from support";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int SID=rs.getInt("SID");
				String Name=rs.getString("Name");
				String Email= rs.getString("Email");
				String Message= rs.getString("Message");
				int DID=rs.getInt("DID");
				String Subject= rs.getString("Subject");
				
				
				SList.add(new support(SID,Name,Email,Message,DID,Subject));
				
				}
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
  		  
  		  return SList;
  		  
      }
      
      public static void deleteSupport(int SID) {
    	  String url ="jdbc:mysql://localhost:3306/Careone?useSSL=false";
  		  String user ="root";
  		  String pass ="Kajanthan@8555";
  		  
  		  
  		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			String sql="delete from support where SID ="+SID+";";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
      }
      
      public static void updateSupport( int SID,String Name,String Email,String Message,String Subject) {
    	  String url ="jdbc:mysql://localhost:3306/Careone?useSSL=false";
  		  String user ="root";
  		  String pass ="Kajanthan@8555";
  		  
  		  
  		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			String sql="update support set Name='"+Name+"',Email='"+Email+"',Message='"+Message+"',,Subject='"+Subject+"'where SID='"+SID+"' where SID='"+SID+"' ;";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
      }
      
      
      
}



