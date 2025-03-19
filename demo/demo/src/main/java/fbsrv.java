import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mindrot.jbcrypt.BCrypt;
import org.hibernate.Transaction;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class fbsrv
 */
@WebServlet("/fbsrv")
public class fbsrv extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public fbsrv() {
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
	    String fullName = request.getParameter("fullname");
	    String email = request.getParameter("email");
	    String mobile = request.getParameter("mobile"); // Added mobile number field
	    String password = request.getParameter("password");
	    String dobStr = request.getParameter("dob");
	    String gender = request.getParameter("gender");

	    Date dob = null;
	    if (dobStr != null && !dobStr.isEmpty()) {
	        try {
	            dob = java.sql.Date.valueOf(dobStr);
	        } catch (IllegalArgumentException e) {
	            response.getWriter().println("Invalid date format!");
	            return;
	        }
	    }

	    // Hash password for security
	    String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
	    
	    User user = new User(fullName, email, mobile, hashedPassword, dob, gender); // Updated constructor

	    SessionFactory factory = HibernateUtil.getSessionFactory();
	    Session session = factory.openSession();
	    Transaction tx = session.beginTransaction();

	    User existingUser = session.createQuery("FROM User WHERE email = :email OR mobile = :mobile", User.class)
                .setParameter("email", email)
                .setParameter("mobile", mobile) // Ensure unique mobile numbers
                .uniqueResult();

        if (existingUser != null) {
            session.close();
            // Redirect back to signup page with an error message
            response.sendRedirect("signup.html?error=User already exists");
            return;
        }

		session.persist(user);
		tx.commit();
        System.out.println("Record saved successfully");
        session.close();
        response.sendRedirect("login.html");
	}
}
