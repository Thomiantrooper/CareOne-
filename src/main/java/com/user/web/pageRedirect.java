package com.user.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.dao.AppointmentDBUtil;


import java.util.List;
import com.user.bean.*;

/**
 * Servlet implementation class pageRedirect
 */
@WebServlet("/pageRedirect")
public class pageRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String triggertype = request.getParameter("triggerType");
		HttpSession session=request.getSession();
		
		if(triggertype.compareToIgnoreCase("manageAppointment")==0) {
			List<Appointment> Alist= AppointmentDBUtil.getAppointmentList();
			session.setAttribute("Alist", Alist);
			
			RequestDispatcher rd= getServletContext().getRequestDispatcher("/ManageAppointment.jsp");
			rd.forward(request,response);
			
			
			
				
			}	
				
			}
		
	}


