
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mindrot.jbcrypt.BCrypt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public login() {
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
		 String email = request.getParameter("email");
	        String password = request.getParameter("password");
	        System.out.print(email);
	        

	        SessionFactory factory = HibernateUtil.getSessionFactory();
	        Session session = factory.openSession();

	        User user = session.createQuery("FROM User WHERE email = :email", User.class)
	                           .setParameter("email", email)
	                           .uniqueResult();
	        
	        session.close();

	        if (user != null && BCrypt.checkpw(password, user.getPassword())) {
	            // Successful login, create session
	            HttpSession httpSession = request.getSession();
	            httpSession.setAttribute("user", user);
	            response.sendRedirect("profile.html"); // Redirect to homepage
	        } else {
	            // Failed login, redirect back with error
	            response.sendRedirect("login.html?error=Invalid credentials");
	        }



}

}
