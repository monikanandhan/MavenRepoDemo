import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Login", urlPatterns = { "/servlet1" })

public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // RequestDispatcher rd=req.getRequestDispatcher("index.html");
        // rd.include(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");
       PrintWriter pw=resp.getWriter();

       String a=req.getParameter("name");
       String b=req.getParameter("password");
       

   
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        }
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/monica","root","")) {
           
        } catch (SQLException e) {
          
            e.printStackTrace();
        }
        
        if(LoginDAO.validate(a, b))
        {  
            RequestDispatcher rd=req.getRequestDispatcher("index.html");  
            rd.forward(req,resp);  
        }  
        else
        {  
            pw.print("Sorry username or password error");  
            RequestDispatcher rd=req.getRequestDispatcher("Login.html");  
            rd.include(req,resp);  
        }  
              
        pw.close();  
    
     }
    }

