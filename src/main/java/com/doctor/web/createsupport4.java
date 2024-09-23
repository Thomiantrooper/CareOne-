package com.doctor.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctor.bean.doctor;
import com.doctor.dao.SupportDBUtil;



@WebServlet("/createsupport4")
public class createsupport4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String Name = request.getParameter("name");      
		String Email = request.getParameter("email");
		String Message = request.getParameter("message");
		String Subject= request.getParameter("subject");
		

		HttpSession session = request.getSession(true);
	    doctor docob = (doctor)session.getValue("Doctor");
		int did= docob.getId();
		
		System.out.println(docob.getId());
		
		
		
		System.out.println(Name);
		System.out.println(Email);
		System.out.println(Message);
		System.out.println(Subject);
		
		SupportDBUtil supportdb = new SupportDBUtil();
		supportdb.support(Name,Email, Message,Subject,did);
		
		//SupportDBUtil supportdb = new SupportDBUtil();
		//boolean accountFound;
		//accountFound = false;
		
	try {
		response.sendRedirect("ManageSupport.jsp");
	}catch(Exception e){
		e.printStackTrace();
	}
	System.out.println("accountfound");
	
		

}
}
