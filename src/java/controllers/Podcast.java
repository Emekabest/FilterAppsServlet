package controllers;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet(name = "Podcast", urlPatterns = {"/podcast"})
public class Podcast extends HttpServlet {
    
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
            
        
            String url = "africanblog";
            String encodedUrl = res.encodeURL(url);
            req.setAttribute("encodeAB", encodedUrl);
            
            
            req.getRequestDispatcher("podcast.jsp").forward(req, res);
           
    }
    
    
    
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        doGet(req, res);
        
        
    }
   
}
