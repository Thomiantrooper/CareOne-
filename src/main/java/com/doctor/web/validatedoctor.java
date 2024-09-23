package com.doctor.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctor.bean.doctor;
import com.doctor.dao.DoctorDBUtil;

@WebServlet("/validatedoctor")
public class validatedoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		
		System.out.println(Password);
		System.out.println(Username);
		
		HttpSession session=request.getSession();
		DoctorDBUtil doctordb = new DoctorDBUtil();
		doctor doctor = doctordb.getDoctor(Username);
		
		System.out.println(doctor);
		System.out.println(doctor.getPassword());
		
		 
		if (doctor.getPassword().compareTo(Password)==0) 
			{System.out.println("success");
			 session.setAttribute("Doctor", doctor);
			 RequestDispatcher RD = getServletContext().getRequestDispatcher("/DoctorIndex.jsp");
			 RD.forward(request, response);
			}else {
				response.sendRedirect("DoctorLogin.jsp?error=pwdWrong");
				}
		//	 session.setAttribute("Doctor", doctor);
		//	 RequestDispatcher RD = getServletContext().getRequestDispatcher("/DoctorIndex.jsp");
		//	 RD.forward(request, response);
		// }else {
		//	 response.sendRedirect("DoctorLogin.jsp?error=pwdWrong");		
		//	 }
		 
	}

}
