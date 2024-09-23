package com.user.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.bean.user;
import com.user.dao.UserDBUtil;


@WebServlet("/createuser4")
public class createuser4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String Name = request.getParameter("name");       //Signup.jsp
		String Phonenumber = request.getParameter("phonenumber");
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		
		//System.out.println(Name);
		//System.out.println(Phonenumber);
		//System.out.println(Username);
		//System.out.println(Password);
		
		UserDBUtil userdb = new UserDBUtil();
		boolean accountFound;
		accountFound = false;
		
		String tempPhone = null;
		String phone_tep = null;
		
		List<user> TempUser = userdb.SelectAllUsers();
		for(user temp : TempUser) {
			phone_tep = temp.getPhonenumber();
			if (Phonenumber.equals(phone_tep)) {
				tempPhone = temp.getPhonenumber();
				accountFound = true;
				System.out.println("Account exist");
				break;
			}
			else {
				tempPhone = null;
			}
		}
		
		if(!accountFound) {
			System.out.println("Account do not exist");
			userdb.registerUser(Name,Phonenumber,Username,Password);
		}
		response.sendRedirect("UserLogin.jsp");
		
		

}
}
