package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		String email=request.getParameter("Email");
		String password=request.getParameter("Password");
		

//		out.println(email);
//		out.println(password);
	
		
		try {

			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","Siva@9866$");
			
			PreparedStatement ps=con.prepareStatement("insert into Login values(?,?)");
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			int i=ps.executeUpdate();
			
			
			if(i>0) {
				out.print("Login successful");
			}
			else {
				out.print("Login not successful");
			}
			
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		catch(ClassNotFoundException e1) {
			System.out.println(e1);
		}
		
		out.close();
		
		
	}

}
