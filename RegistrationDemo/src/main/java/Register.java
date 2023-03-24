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
public class Register extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        String n=req.getParameter("uname");
        String p=req.getParameter("psw");
        String e=req.getParameter("email");
        String c=req.getParameter("country");

      
            try {
                Class.forName("com.mysql.jdbc.Driver.");
            } catch (ClassNotFoundException e1) {
            
                e1.printStackTrace();
            }
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Monica","root","")) 
            {
                String m="insert into monica values(?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(m);
                ps.setString(1, n);
                ps.setString(2, p);
                ps.setString(3, e);
                ps.setString(4, c);
                ps.executeUpdate();
            pw.print("You are successfully registered...");  
            } catch (SQLException e1) {
                
                e1.printStackTrace();
            }  
       

    }
}
