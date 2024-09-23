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
import com.user.dao.ContactusDBUtil;
import com.user.dao.UserDBUtil;



@WebServlet("/createcontactus4")
public class createcontactus4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String Name = request.getParameter("name");      
		String Email = request.getParameter("email");
		String Message = request.getParameter("message");
		String Subject= request.getParameter("subject");
		
		//HttpSession session=request.getSession();
		//UserDBUtil userdb = new UserDBUtil();
		//user user = userdb.getUser(Username);
		
		HttpSession session = request.getSession(true);
		user usob = (user)session.getValue("User");
		int uid= usob.getId();
		
		System.out.println(usob.getId());
		
		//HttpSession session=request.getSession();
		//UserDBUtil userdb = new UserDBUtil();
		//user user = userdb.getUser(Username);
		 
		 //if (user.getPassword().compareTo(Password)==0) {
		//	 session.setAttribute("User", user);
		//	 RequestDispatcher RD = getServletContext().getRequestDispatcher("/UserIndex.jsp");
		//	 RD.forward(request, response);
		// }else {
		//	 response.sendRedirect("UserLogin.jsp?error=pwdWrong");		 }
		 
	
		
		System.out.println(Name);
		System.out.println(Email);
		System.out.println(Message);
		System.out.println(Subject);
		
		
		ContactusDBUtil contactustdb = new ContactusDBUtil();
		contactustdb.contactus(Name,Email, Message,Subject,uid); 
		
		
		
		//boolean accountFound;
		//accountFound = false;
		
	try {
		response.sendRedirect("UserIndex.jsp");
	}catch(Exception e){
		e.printStackTrace();
	}
	//System.out.println("accountfound");
	
		

}

}
