import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet{

    // @Override
    // protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    // }
    // @Override
    // protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //    resp.setContentType("text/html");
    //    PrintWriter pw=resp.getWriter();
    //    String n=req.getParameter("name");
    //    pw.println("welcome"+n);

    //    Cookie ck=new Cookie("uname", n);
    //    resp.addCookie(ck);

    //    pw.print("<form action='servlet2'>");  
    //    pw.print("<input type='submit' value='go'>");  
    //    pw.print("</form>");  
             
    //    pw.close();  
    // }
    public void doGet(HttpServletRequest request, HttpServletResponse response){  
        try{  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        String n=request.getParameter("userName");  
        out.print("Welcome "+n);  
          
        //creating form that have invisible textfield  
        out.print("<form action='servlet2'>");  
        out.print("<input type='hidden' name='uname' value='"+n+"'>");  
        out.print("<input type='submit' value='go'>");  
        out.print("</form>");  
        out.close();  
  
                }catch(Exception e){System.out.println(e);}  
    }  
  
}
