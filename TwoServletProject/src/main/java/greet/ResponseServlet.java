package greet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseServlet
 */

public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();
		// write the data of the response 
		out.println("<html><head><title>Hello</title></head>"); 
		String username = request.getParameter("username"); 
		out.println("<body bgcolor=\"#ffffff\"><h2>Your name is " + username + "</h2>" );
		
		out.println("<body bgcolor=\"#ffffff\"><h2>Your age is " + request.getAttribute("age") + "</h2>" );
		
		out.println("</body></html>");
	    out.close();
	}

}
