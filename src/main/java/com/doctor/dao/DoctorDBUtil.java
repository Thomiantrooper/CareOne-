package com.doctor.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.doctor.bean.doctor;


public class DoctorDBUtil {

private static boolean isSuccess;
	
	private static ResultSet rs=null;
	
	private String url ="jdbc:mysql://localhost:3306/Careone?useSSL=false";
	 private String userName = "root";
	 private String password = "Kajanthan@8555";
	 private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	 
	 private static final String insert_doctor="INSERT INTO Registered_Doctor"+"(Name,Phone,Username,Password)VALUES" + "(?,?,?,?);";
	 private static final String select_doctor="SELECT * FROM Registered_Doctor";
	 private static final String update_doctor = "UPDATE Registered_Doctor SET Name=?,Phone=?,Password=? WHERE DID=?;";
	 
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
	
		public boolean registerDoctor(String Name,String Phone,String Username,String Password) {
		System.out.println(Name);
		System.out.println(Phone);
		System.out.println(Username);
		System.out.println(Password);
		
		boolean isSuccess = false;
		
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(insert_doctor)){
			
                 System.out.println(con);
                 
			preparedStatement.setString(1,Name);
			preparedStatement.setString(2,Phone);
			preparedStatement.setString(3,Username);
			preparedStatement.setString(4,Password);
			
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

		
//db values read
        
	public List<doctor> SelectAllDoctors(){
		List<doctor> doctorList =new ArrayList<>();
		
		try (Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(select_doctor);
				ResultSet result = preparedStatement.executeQuery();){
			System.out.println(result);
			
			while(result.next()){
				int id = result.getInt("DID");
				String name = result.getString("Name");
				String phonenumber = result.getString("Phone");
				String username = result.getString("Username");
				String password = result.getString("Password");
				
				System.out.println(id);
				doctorList.add(new doctor(id,name,phonenumber,username,password));
				}
			
	}catch (SQLException e) {
		e.printStackTrace();
	}
		System.out.println(doctorList);
	return doctorList;
	
  }
	public doctor getDoctor(String uname) {
		Connection con = getConnection();
		String sql="select * from Registered_Doctor where Username=?;";
		doctor doctor=new doctor();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,uname);
			//System.out.println(uname);
			ResultSet rs=stmt.executeQuery();
			if(rs.next()) {
				doctor.setUsername(uname);
				doctor.setId(rs.getInt("DID"));
				doctor.setName(rs.getString("Name"));
				doctor.setPhonenumber(rs.getString("Phone"));
				doctor.setPassword(rs.getString("Password"));
				
				//System.out.println(rs.getString("Password"));
				//System.out.println(rs.getString("Phone"));
				
			}		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				
			}
		}
		//System.out.println(doctor);
		return doctor;	
	}
	public boolean updatedoctor(doctor doc) {
		boolean rowUpdated =false;
		try(Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement( update_doctor); ){
                    statement.setString(1,doc.getName());
                    statement.setString(2,doc.getPhonenumber());
                    statement.setString(3,doc.getPassword());
                    statement.setInt(4,doc.getId());

                 rowUpdated = statement.executeUpdate() > 0 ;
          } catch (SQLException e) {
			
			e.printStackTrace();
		}
             return rowUpdated;
}
}
