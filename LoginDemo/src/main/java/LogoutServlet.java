import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
// import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();

        req.getRequestDispatcher("link.html").include(req, resp);  

    //     Cookie ck=new Cookie("name", "");
    //     ck.setMaxAge(0);
    //    resp.addCookie(ck);
    HttpSession session=req.getSession();
    session.invalidate();
       
       pw.print("you are successfully logged out!");  

    }
}
