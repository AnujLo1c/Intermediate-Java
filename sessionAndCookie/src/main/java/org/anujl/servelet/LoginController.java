package org.anujl.servelet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.net.CookieHandler;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name=request.getParameter("firstName");
	String password=request.getParameter("password");
	if(name.equals("anuj") && password.equals("asdf")) {
		request.getSession().invalidate();
		HttpSession newSession=request.getSession();
		newSession.setMaxInactiveInterval(10000);
		Cookie cookie=new Cookie("user", name);
		response.addCookie(cookie);
		response.sendRedirect("member.jsp");
	}
	else {
		response.sendRedirect("login.jsp");
		
	}
	}

}
