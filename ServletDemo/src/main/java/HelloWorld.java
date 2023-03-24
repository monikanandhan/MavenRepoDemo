import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
  String Message;
     public void init()
     {
       System.out.println("init method is working");
       Message="Hello";
     }
    //  public void service()
    //  {
    //     System.out.println("service is prinitng");
    //  }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
        out.println("<h1>" +Message+ "</h1>");
    }
     public void destroy()
     {
        System.out.println("destroy is priniting");
     }
}
