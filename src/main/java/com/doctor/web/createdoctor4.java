package com.doctor.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctor.bean.doctor;
import com.doctor.dao.DoctorDBUtil;


@WebServlet("/createdoctor4")
public class createdoctor4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String Name = request.getParameter("name");       //Signup.jsp
		String Phonenumber = request.getParameter("phonenumber");
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		
		
		DoctorDBUtil doctordb = new DoctorDBUtil();
		boolean accountFound;
		accountFound = false;
		
		String tempPhone = null;
		String phone_tep = null;
		
		List<doctor> TempDoctor = doctordb.SelectAllDoctors();
		for(doctor temp : TempDoctor) {
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
			doctordb.registerDoctor(Name,Phonenumber,Username,Password);
		}
		response.sendRedirect("DoctorLogin.jsp");
		
		

}
}
