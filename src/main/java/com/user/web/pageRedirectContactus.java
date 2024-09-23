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
 * Servlet implementation class pageRedirectContactus
 */
@WebServlet("/pageRedirectContactus")
public class pageRedirectContactus extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String triggertype = request.getParameter("triggerType");
		HttpSession session=request.getSession();
		
		if(triggertype.compareToIgnoreCase("manageContactus")==0) {
			List<Contactus> Clist= ContactusDBUtil.getContactusList();
			session.setAttribute("Clist", Clist);
			
			RequestDispatcher rd= getServletContext().getRequestDispatcher("/ManageContactus.jsp");
			rd.forward(request,response);
			
			
			
				
			}	
				
			}
}
