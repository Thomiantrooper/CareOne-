package com.doctor.web;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.doctor.bean.support;
import com.doctor.dao.SupportDBUtil;


/**
 * Servlet implementation class manageSupport
 */
@WebServlet("/manageSupport")
public class manageSupport extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd= getServletContext().getRequestDispatcher("/ManageSupport.jsp");
		rd.forward(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String trigger = request.getParameter("Trigger");
		
		if(trigger.compareToIgnoreCase("DeleteSup")==0) {
				
		int SID = Integer.parseInt(request.getParameter("SID"));
		
		SupportDBUtil.deleteSupport(SID);
		
		List<support> Slist= SupportDBUtil.getSupportList();
		session.setAttribute("Slist", Slist);
		
		response.sendRedirect("manageSupport");
		}
		else if(trigger.compareToIgnoreCase("UpdateSup")==0) {
			
			int SID = Integer.parseInt(request.getParameter("SID"));
			String Name=request.getParameter("Name");
			String Email=request.getParameter("Email");
			String Message=request.getParameter("Message");
			String Subject=request.getParameter("Subject");
			
			SupportDBUtil.updateSupport(SID, Name, Email,Subject, Message);
			
			List<support> Slist= SupportDBUtil.getSupportList();
			session.setAttribute("Slist", Slist);
			
			response.sendRedirect("manageSupport");
		}
		
	}
}
