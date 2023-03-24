import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{

    // @Override
    // protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    // }
    // @Override
    // protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //     resp.setContentType("text/html");
    //     PrintWriter pw=resp.getWriter();
    //     Cookie ck[]=req.getCookies();
    //     pw.println(ck[0].getValue());
    //     pw.close();
    // }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  
        {  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        //Getting the value from the hidden field  
        String n=request.getParameter("uname");  
        out.print("Hello "+n);  
  
        out.close();  
               
                }
            }
