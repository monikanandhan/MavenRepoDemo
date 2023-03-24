import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "Score", urlPatterns = {"/servlet2"})
public class Score extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
       doPost(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
       PrintWriter pw=resp.getWriter();

       String a=req.getParameter("TechnicalSkill");
       String b=req.getParameter("AssesmentType");
       String c=req.getParameter("AssesmentDescription");
       String d=req.getParameter("score");
       String e=req.getParameter("Remarks");
       String f=req.getParameter("url");
       String g=req.getParameter("AssesmentBy");

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/monica","root","");
        PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
        ps.setString(1, a);
        ps.setString(2, b);
        ps.setString(3, c);
        ps.setString(4, d);
        ps.setString(5, e);
        ps.setString(6, f);
        ps.setString(7, g);

        int i=ps.executeUpdate();  
if(i>0)  
pw.print("You are successfully registered...");  

    } catch (ClassNotFoundException | SQLException e1) {
       
        e1.printStackTrace();
    }


    }
}


