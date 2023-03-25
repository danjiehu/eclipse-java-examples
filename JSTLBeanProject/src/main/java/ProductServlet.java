

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * Step-1: Read request parameters i.e. name and category 
		 * Step-2: Create a Java Bean 'product' object and add step-1
		 *  Step-3: Get session and check 'productlist' attribute is already there or not 
		 *  Step-4: if 'productlist' is not there, then initialize a new one 
		 *  Step-5: Add 'product' object from Step-2, in 'productlist' 
		 *  Step-6: Add 'productlist' in a session 
		 *  Step-7: Redirect to JSP i.e ShowProducts.jsp
		 */

		// Step-1

		String name = request.getParameter("name");
		String category = request.getParameter("category");
		
		// Step-2

		Product p = new Product();

		p.setName(name);
		p.setCategory(category);

		// Step-3

		HttpSession session = request.getSession();
		ArrayList<Product> products = (ArrayList) session.getAttribute("productlist");

		// Step-4

		if (products == null) {

			products = new ArrayList<>();
		}

		// Step-5

		products.add(p);

		// Step-6

		session.setAttribute("productlist", products);

		// Step-7

		request.getRequestDispatcher("/ShowProducts.jsp").forward(request, response);

	}
	

}
