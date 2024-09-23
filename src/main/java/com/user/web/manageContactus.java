package com.user.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.bean.Contactus;
import com.user.dao.ContactusDBUtil;

/**
 * Servlet implementation class manageContactus
 */
@WebServlet("/manageContactus")
public class manageContactus extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd= getServletContext().getRequestDispatcher("/ManageContactus.jsp");
		rd.forward(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String trigger = request.getParameter("Trigger");
		
		if(trigger.compareToIgnoreCase("DeleteCont")==0) {
				
		int CID = Integer.parseInt(request.getParameter("CID"));
		
		ContactusDBUtil.deleteContactus(CID);
		
		List<Contactus> Clist= ContactusDBUtil.getContactusList();
		session.setAttribute("Clist", Clist);
		
		response.sendRedirect("manageContactus");
		}else if(trigger.compareToIgnoreCase("UpdateCont")==0) {
			
			int CID = Integer.parseInt(request.getParameter("CID"));
			String Name=request.getParameter("Name");
			String Email=request.getParameter("Email");
			String Message=request.getParameter("Message");
			String Subject=request.getParameter("Subject");
			
			ContactusDBUtil.updateContactus(CID, Name, Email, Message, Subject);
			
			List<Contactus> Clist= ContactusDBUtil.getContactusList();
			session.setAttribute("Clist", Clist);
			
			response.sendRedirect("manageContactus");
		}
		
	}
}
