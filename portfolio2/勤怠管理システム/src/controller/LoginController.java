package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.LoginService;

@WebServlet("/login")
public class LoginController extends HttpServlet{
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 	HttpSession session = request.getSession();
	 	if(session.getAttribute("id") == null) {
	 		response.sendRedirect("login.html");
	 	} else {
	 		response.sendRedirect("login.html");
	 	}
	 }
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 	HttpSession session = request.getSession();
	 	String id = request.getParameter("id");
	 	String pass = request.getParameter("pass");

	 	try {
           LoginService ls = new LoginService();
           ls.serch(id, pass);
	 	}catch(Exception e) {
	 		e.printStackTrace();
	 	}finally {
	 	}
	 }

}
