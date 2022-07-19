package registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registration.dao.RegisterDao;
import registration.models.Registration;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private RegisterDao registerDao= new RegisterDao(); 
  
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
//		Registration register = new Registration();
//		register.setEmail(email);
//		register.setPassword(password);
		try {
			registerDao.register(register);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		RequestDispatcher dispatcher =request.getRequestDispatcher("/index.html");
		dispatcher.forward(request, response);
	}

}
