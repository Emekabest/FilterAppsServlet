
package controllers;

import java.io.IOException;
import java.time.Duration;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet(name = "AfricanBlog", urlPatterns = {"/blogs/africanblog"})
public class AfricanBlog extends HttpServlet  {
    private ShutdownExample SDE = new ShutdownExample();
   
     
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        
        
        SDE.enteringServiceMethod();
        try{
            Thread.sleep(4000);
            System.out.println("ServiceCounter::"+SDE.numServices());
            super.service(req, res);
        
        }
        catch(InterruptedException e){
            System.out.println("An exception occured::"+ e.getMessage());

        }
        finally{
           
            SDE.leavingServiceMethod();
            System.out.println("ServiceCounter::"+SDE.numServices());
        }
        
    }
    
    
    
    
    @Override
    public void destroy(){
        
        if (SDE.numServices() > 0){
            SDE.setShuttingDown(true);
            
        }
        else{
          
                System.out.println("Noo sservice is running at the moment");

        }
        
        
        
        
        while(SDE.numServices() > 0){
            try{
                Thread.sleep(2000);
                System.out.println("Thread has finished sleeping...");
            }
            catch(InterruptedException e){
            
                System.out.println("InterruptedExceptionError::"+e.getMessage());
            }
        
        }
        
    }
    
}
