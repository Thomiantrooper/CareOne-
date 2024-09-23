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
 * Servlet implementation class pageRedirectSupport
 */
@WebServlet("/pageRedirectSupport")
public class pageRedirectSupport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String triggertype = request.getParameter("triggerType");
		HttpSession session=request.getSession();
		
		if(triggertype.compareToIgnoreCase("manageSupport")==0) {
			List<support> Slist= SupportDBUtil.getSupportList();
			session.setAttribute("Slist",  Slist);
			
			RequestDispatcher rd= getServletContext().getRequestDispatcher("/ManageSupport.jsp");
			rd.forward(request,response);
			
			
			
				
			}	
				
	}
}





