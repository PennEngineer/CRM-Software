package testDB;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class TestDBServlet
 */
@WebServlet("/TestDBServlet")
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// set up connection variables
		String user = "springstudent";
		String pass = "springstudent";
		String jdbcURL = "jdbc:mysql://127.0.0.1:3306/web_customer_tracker?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			
			PrintWriter out = response.getWriter();
			
			out.println("Connecting to database: " + jdbcURL);
			
			Class.forName(driver);
			
			Connection myConnection = DriverManager.getConnection(jdbcURL,user,pass);
			
			out.println("Success!!!");
			
			myConnection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// get connection to database
		
	}

}
