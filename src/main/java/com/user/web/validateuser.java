package com.user.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.bean.user;
import com.user.dao.UserDBUtil;

/**
 * Servlet implementation class validateuser
 */
@WebServlet("/validateuser")
public class validateuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		
		HttpSession session=request.getSession();
		UserDBUtil userdb = new UserDBUtil();
		user user = userdb.getUser(Username);
		 
		 if (user.getPassword().compareTo(Password)==0) {
			 session.setAttribute("User", user);
			 System.out.println(user.getId());
			 RequestDispatcher RD = getServletContext().getRequestDispatcher("/UserIndex.jsp");
			 RD.forward(request, response);
		 }else {
			 response.sendRedirect("UserLogin.jsp?error=pwdWrong");		 }
		 
	}
    
}

