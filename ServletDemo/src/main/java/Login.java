import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter pw=response.getWriter();

       
        String p=request.getParameter("password");

        if(p.equals("servlet"))
        {
            RequestDispatcher rd=request.getRequestDispatcher("Welcome");
            rd.forward(request, response);
        }
        else{
            pw.println("Sorry UserName or Password Error!");
            RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
            rd.include(request, response);  
        }
    }
}
