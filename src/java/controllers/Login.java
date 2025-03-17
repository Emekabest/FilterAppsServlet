
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;



@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {
    
    
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        
        User user = new User(req.getParameter("firstname"), req.getParameter("age"), req.getParameter("nationality"));
        
        
         Cookie ck = new Cookie("user", "12345");
         res.addCookie(ck);
         
           
         
        ServletContext context = getServletContext();
        context.setAttribute("user-nationality", user.getNationality());
        
        HttpSession session = req.getSession();

        res.sendRedirect("podcast?session-id=" + session.getId());

    }
        
    
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        doGet(req, res);
       
    }
    
    
    
    @Override
    public void destroy(){
    
        System.out.println("You are destroyed!!!");
    
    }
}
