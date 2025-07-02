package org.anujl.servlet;

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
 * Servlet implementation class Home
 */
@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
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
			case "home":
				request.setAttribute("title", "Home");
				request.getRequestDispatcher("index.jsp").forward(request,response);
				break;
			case "adduser":
				request.setAttribute("title", "Add User");
				request.getRequestDispatcher("addUser.jsp").forward(request,response);
				break;
			case "updateuser":
				request.setAttribute("title", "Update User");
				request.getRequestDispatcher("updateUser.jsp").forward(request,response);
				break;
			case "deleteuser":
				request.setAttribute("title", "Delete User");
				request.getRequestDispatcher("deleteUser.jsp").forward(request,response);
				break;
			case "listuser":
				listUsers(request, response);
				request.getRequestDispatcher("listUsers.jsp").forward(request,response);
			break;
			default:
				request.setAttribute("title", "List Users");
				System.out.print("Asdf");
			}
		}
		else {
			request.getRequestDispatcher("error.jsp").forward(request,response);
		}
		
	}

	private void listUsers(HttpServletRequest request, HttpServletResponse response) {
		List<User> data=new UserModel().listusers();
		request.setAttribute("title", "List Users");
		request.setAttribute("data", data);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String para=request.getParameter("form");
		if(para!=null) {
			para=para.toLowerCase();
			switch(para) {
			case "addform":
				new UserModel().addUser(new User(0, request.getParameter("name"),request.getParameter("pass")));
				listUsers(request,response);
				request.getRequestDispatcher("listUsers.jsp").forward(request,response);
				
				break;
			case "update":
				new UserModel().updateUser(new User(Integer.valueOf(request.getParameter("id")),request.getParameter("user"),request.getParameter("pass")));
				listUsers(request,response);
				request.getRequestDispatcher("listUsers.jsp").forward(request,response);
				break;
			case "delete":
				new UserModel().deleteUser(Integer.valueOf(request.getParameter("id")));
				listUsers(request,response);
				request.getRequestDispatcher("listUsers.jsp").forward(request,response);
				break;
			}
		}
		else {
			System.out.println("print");
			request.getRequestDispatcher("error.jsp").forward(request,response);
		}
//		request.getRequestDispatcher("listUsers.jsp").forward(request,response);
		
	}

}
