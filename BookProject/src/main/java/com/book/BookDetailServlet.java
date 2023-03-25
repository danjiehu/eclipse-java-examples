package com.book;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.annotation.WebServlet;

@WebServlet("/myServlet")
public class BookDetailServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public void doGet (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		// set content-type header before accessing the Writer 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		
		// then write the response 
		out.println("<html><head><title>Book Description</title></head>"); 
		out.println("</body><h1>Book Detail Servlet</h1>");

			//Get the identifier of the book to display
			String bookId = request.getParameter("bookId");
			String age = request.getParameter("age") ;
			if (bookId != null) 
				out.println("The identifier entered for the book was " + bookId);
				
			out.println("</body></html>");
			out.close();
			
	}
}
