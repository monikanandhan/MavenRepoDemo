import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;


public class FileUpload extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        
        String path=getServletContext().getRealPath("");
        // MultipartRequest m = new MultipartRequest(req, "C:\\temp");
        MultipartRequest m = new MultipartRequest(req, path,20*1024*1024);
        // MultipartRequest m = new MultipartRequest(req,"D:\monica\mavenProject\FileUploading\files",20*1024*1024);
        pw.print("File uploaded successfully");
    }
}
