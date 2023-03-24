import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Welcome extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  //   resp.setContentType("text/html");
  //   PrintWriter pw=resp.getWriter();

  //   // pw.println("<html><body>");
  //   // String n=req.getParameter("uname");
  //   // pw.println("Welcome to servlet"+n);
  //   // pw.println("</body></html>");
  //   ServletContext s=getServletContext();
  //   String a = (String)s.getAttribute("username");
  //   pw.println("welcome"+a);
  }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      resp.setContentType("text/html");
      PrintWriter pw=resp.getWriter();
      Cookie ck[]=req.getCookies();
      pw.print(ck[0].getValue());

      // pw.println("<html><body>");
      // String n=req.getParameter("uname");
      // pw.println("Welcome to servlet"+n);
      // pw.println("</body></html>");
      // ServletContext s=getServletContext();
      // String a = (String)s.getAttribute("username");
      // pw.println("welcome"+a);
    }
  }
