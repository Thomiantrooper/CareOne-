package com.user.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import com.user.bean.user;
import com.user.dao.AppointmentDBUtil;
import com.user.dao.ContactusDBUtil;



/**
 * Servlet implementation class createappointment4
 */
@WebServlet("/createappointment4")
public class createappointment4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String Name = request.getParameter("name");      
		String Email = request.getParameter("email");
		String Phone = request.getParameter("phone");
		String Message = request.getParameter("message");
		String Date= request.getParameter("date");
		String Department= request.getParameter("department");
		
		//HttpSession session = request.getSession(true);
		//user usob = (user)session.getValue("User");
		//int uid= usob.getId();
		
		//System.out.println(usob.getId());
		
		System.out.println(Name);
		System.out.println(Email);
		System.out.println(Phone);
		System.out.println(Message);
		System.out.println(Date);
		System.out.println(Department);
		
		//AppointmentDBUtil appointmentdb = new AppointmentDBUtil();
		//appointmentdb.createAppointment(Name,Email,Phone,Message,Date,Department,uid);
		//boolean accountFound;
		//accountFound = false;
		
	try {
		response.sendRedirect("Payment.jsp");
	}catch(Exception e){
		e.printStackTrace();
	}
	//System.out.println("accountfound");
	
		

}
}


