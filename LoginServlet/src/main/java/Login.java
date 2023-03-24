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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "Login", urlPatterns = {"/servlet1"})
// @ServletSecurity(
//         value = @HttpConstraint(
//                 rolesAllowed = {
//                         "employee"
//                 }),
//         httpMethodConstraints = {
//                 @HttpMethodConstraint(value = "GET", rolesAllowed = {
//                         "employee"
//                 })
//         })
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd=req.getRequestDispatcher("index.html");
        rd.include(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html");
//        PrintWriter pw=resp.getWriter();

//        String a=req.getParameter("TechnicalSkill");
//        String b=req.getParameter("AssesmentType");
//        String c=req.getParameter("AssesmentDescription");
//        String d=req.getParameter("score");
//        String e=req.getParameter("Remarks");
//        String f=req.getParameter("url");
//        String g=req.getParameter("AssesmentBy");

//     try {
//         Class.forName("com.mysql.jdbc.Driver");
//         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/monica","root","");
//         PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
//         ps.setString(1, a);
//         ps.setString(2, b);
//         ps.setString(3, c);
//         ps.setString(4, d);
//         ps.setString(5, e);
//         ps.setString(6, f);
//         ps.setString(7, g);

//         int i=ps.executeUpdate();  
// if(i>0)  
// pw.print("You are successfully registered...");  

//     } catch (ClassNotFoundException | SQLException e1) {
//         // TODO Auto-generated catch block
//         e1.printStackTrace();
//     }


  }
}
