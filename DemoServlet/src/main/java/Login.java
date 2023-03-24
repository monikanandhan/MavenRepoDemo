import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// @WebServlet("/servlet1")
public class Login extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();

        // resp.sendRedirect("http://www.google.com");

         String n=req.getParameter("uname");
        // String p=req.getParameter("psw");
        // if(p.equals("servlet"))
        // {
        // RequestDispatcher rd=req.getRequestDispatcher("servlet2");
        // rd.include(req,resp);
        // }
        // else
        // {
        //     pw.println("Sorry wrong username and password");
        //     RequestDispatcher rd=req.getRequestDispatcher("index.html");
        //     rd.include(req,resp);

        // }

        // ServletConfig config=getServletConfig();
        // String a = config.getInitParameter("username");
        // pw.println(a);
        // pw.close();

    //     ServletContext s=getServletContext();
    //     s.setAttribute("username", "monica");
    //    pw.println("welcome to first servlet");
    //    pw.println("<a href='servlet2'>visit</a>");
    //     pw.close();

            Cookie ck=new Cookie("username",n);
            resp.addCookie(ck);

            pw.print("<form action='servlet2'>");  
            pw.print("<input type='submit' value='go'>");  
          pw.print("<'/form>");
          

    }
}

