package controller; 

import java.io.IOException; 


import javax.servlet.RequestDispatcher; 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 


import model.Customer; 
import service.CustomerService; 

@WebServlet("/doregister") 


public class DoRegister extends HttpServlet 
{ 
	private static final long serialVersionUID = 1L; 
	
	public DoRegister() 
	{ 
		super(); 
	
	} 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{ 
	
				String id = request.getParameter("id"); 
		 		String password = request.getParameter("password"); 
		 		String name = request.getParameter("name"); 
				String gender = request.getParameter("gender"); 
				String email = request.getParameter("email"); 
	
		 		CustomerService service = (CustomerService) CustomerService.getInstance(); 
		 		Customer customers = new Customer(id,password,name,gender,email);  
		 
		 		service.addCustomer(customers); 
		 
		 		String page; 
		 
		 		page = "/view/registerSuccess.jsp"; 
		 		request.setAttribute("customer", customers); 
		 

		 		RequestDispatcher dispatcher = request.getRequestDispatcher(page); 
		 		dispatcher.forward(request, response); 


	} 

} 
