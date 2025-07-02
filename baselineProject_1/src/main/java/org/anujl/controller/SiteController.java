package org.anujl.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import org.anujl.entity.User;
import org.anujl.model.UserModel;

/**
 * Servlet implementation class SiteController
 */
@WebServlet("/site")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SiteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String para=request.getParameter("page");
		if(para!=null) {
			para=para.toLowerCase();
			switch(para) {
			
			case "listuser":
				List<User> data=new UserModel().listusers();
				request.setAttribute("title", "List Users");
				System.out.println("here");
				request.setAttribute("data", data);
				request.getRequestDispatcher("listUsers.jsp").forward(request,response);
			break;
			default:


				request.setAttribute("title", "List Users");
				request.getRequestDispatcher("error.jsp").forward(request,response);
//				System.out.print("Asdf");
			}
		}
		else {
			request.getRequestDispatcher("error.jsp").forward(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

}
