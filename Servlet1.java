package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Cookie cookieForName = new Cookie("myName", request.getParameter("my_name"));
		
		cookieForName.setMaxAge(20*20);
		
		Cookie cookieForPassword = new Cookie("password", request.getParameter("password"));
		cookieForPassword.setMaxAge(20*20);
		 
		response.addCookie(cookieForName);
		response.addCookie(cookieForPassword);
		response.sendRedirect("welcome.jsp");
	}

}
