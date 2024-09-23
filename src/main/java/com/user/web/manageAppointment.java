package com.user.web;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.bean.Appointment;
import com.user.dao.AppointmentDBUtil;

/**
 * Servlet implementation class manageAppointment
 */
@WebServlet("/manageAppointment")
public class manageAppointment extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd= getServletContext().getRequestDispatcher("/ManageAppointment.jsp");
		rd.forward(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String trigger = request.getParameter("Trigger");
		
		if(trigger.compareToIgnoreCase("DeleteApp")==0) {
				
		int AID = Integer.parseInt(request.getParameter("AID"));
		
		AppointmentDBUtil.deleteAppointment(AID);
		
		List<Appointment> Alist= AppointmentDBUtil.getAppointmentList();
		session.setAttribute("Alist", Alist);
		
		response.sendRedirect("manageAppointment");
		}else if(trigger.compareToIgnoreCase("UpdateApp")==0) {
			{
			
			int AID = Integer.parseInt(request.getParameter("AID"));
			String Name=request.getParameter("Name");
			String Email=request.getParameter("Email");
			LocalDate Date=LocalDate.parse(request.getParameter("AID"));
			String Phone=request.getParameter("Phone");
			String Department=request.getParameter("Department");
			String Message=request.getParameter("Message");
			
			AppointmentDBUtil.updateAppointment(AID, Name, Email, Phone, Message, Date, Department);
			
			List<Appointment> Alist= AppointmentDBUtil.getAppointmentList();
			session.setAttribute("Alist", Alist);
			
			response.sendRedirect("manageAppointment");
		}
		
	}

  }
}
