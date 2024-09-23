package com.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.user.bean.user;
public class UserDBUtil {

private static boolean isSuccess;
	
	private static ResultSet rs=null;
	
	private String url ="jdbc:mysql://localhost:3306/Careone?useSSL=false";
	 private String userName = "root";
	 private String password = "Kajanthan@8555";
	 private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	 
	 private static final String insert_user="INSERT INTO Registered_User"+"(Name,Phone,Username,Password)VALUES" + "(?,?,?,?);";
	 private static final String select_user="SELECT * FROM Registered_User";
	 private static final String update_user = "UPDATE Registered_User SET Name=?,Phone=?,Password=? WHERE RID=?;";
	 
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
	
		public boolean registerUser(String Name,String Phone,String Username,String Password) {
		System.out.println(Name);
		System.out.println(Phone);
		System.out.println(Username);
		System.out.println(Password);
		
		boolean isSuccess = false;
		
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(insert_user)){
			
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
        
	public List<user> SelectAllUsers(){
		List<user> userList =new ArrayList<>();
		
		try (Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(select_user);
				ResultSet result = preparedStatement.executeQuery();){
			System.out.println(result);
			
			while(result.next()){
				int id = result.getInt("RID");
				String name = result.getString("Name");
				String phonenumber = result.getString("Phone");
				String username = result.getString("Username");
				String password = result.getString("Password");
				
				System.out.println(id);
				userList.add(new user(id,name,phonenumber,username,password));
				}
			
	}catch (SQLException e) {
		e.printStackTrace();
	}
		System.out.println(userList);
	return userList;
	
  }
	public user getUser(String uname) {
		Connection con = getConnection();
		String sql="select * from Registered_User where Username=?;";
		user user=new user();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,uname);
			System.out.println(uname);
			ResultSet rs=stmt.executeQuery();
			if(rs.next()) {
				user.setUsername(uname);
				user.setId(rs.getInt("RID"));
				user.setName(rs.getString("Name"));
				user.setPhonenumber(rs.getString("Phone"));
				user.setPassword(rs.getString("Password"));
				//user =new user( id,  name,  phonenumber,  uname,  password);
				System.out.println(rs.getString("Password"));
				System.out.println(rs.getString("Phone"));
				
			}		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				
			}
		}
		System.out.println(user);
		return user;	
	}
	public boolean updateuser(user us) {
		boolean rowUpdated =false;
		try(Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement( update_user); ){
                    statement.setString(1,us.getName());
                    statement.setString(2,us.getPhonenumber());
                    statement.setString(3,us.getPassword());
                    statement.setInt(4,us.getId());

                 rowUpdated = statement.executeUpdate() > 0 ;
          } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
             return rowUpdated;
}
	
}
