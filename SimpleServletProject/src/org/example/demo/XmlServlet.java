package org.example.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 
 * @author ajeet.bal
 * @desc create servlet without annotation
 *
 */
public class XmlServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter output = response.getWriter();
		String userName = request.getParameter("userName");

		// context - more than session (across the application)
		ServletContext context = request.getServletContext();
		// session (only for one browser tab)
		HttpSession session = request.getSession();
		if (!userName.isEmpty() && !userName.equals(null)) {
			session.setAttribute("savedUserName", userName);
			context.setAttribute("savedContextUserName", userName);

		}
		output.println("<h2> doGet Method </h2> <br/>" + "Hello " + userName);
		output.println("<h2> doGet Method with Session </h2> <br/>" + "Hello " + session.getAttribute("savedUserName"));
		output.println("<h2> doGet Method with Context </h2> <br/>" + "Hello " + context.getAttribute("savedContextUserName"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter output = response.getWriter();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String gender = request.getParameter("gender");
		String car = request.getParameter("car");
		String[] locations = request.getParameterValues("location");
		output.print("<h1> doPost Method </h1>");

		output.println("Hello " + firstName + " " + lastName + " is a " + gender + " and have a " + car
				+ " and lived in " + locations.length + " places");
	}
}
