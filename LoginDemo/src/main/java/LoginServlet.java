import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
// import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        req.getRequestDispatcher("link.html").include(req, resp);  

        String n=req.getParameter("name");
        String p=req.getParameter("password");
        if(p.equals("admin123"))
        {
            pw.print("You are successfully logged in!");  
            pw.print("<br>Welcome, "+n);  

            // Cookie ck=new Cookie("name",n);
            // resp.addCookie(ck);
            HttpSession session=req.getSession();
            session.setAttribute("name", n);
        }
        else{
            pw.print("sorry, username or password error!"); 
            req.getRequestDispatcher("Login.html").include(req, resp);
        }
        pw.close();
    }
   
}
