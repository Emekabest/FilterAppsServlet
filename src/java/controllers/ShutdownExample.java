
package controllers;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ShutdownExample extends HttpServlet {
    
    private int serviceCounter = 0;
    private boolean shuttingDown;
    
    
    
    
    protected synchronized void enteringServiceMethod(){
        serviceCounter++;
    
    }
    
    
    protected synchronized void leavingServiceMethod(){
        serviceCounter--;
        
    }
    
  
     protected synchronized int numServices(){
        
         return serviceCounter;
    }
     
     
     
    protected synchronized void setShuttingDown(boolean flag){
    
        shuttingDown = flag;
    }
    
    
    protected synchronized boolean isShuttingDown(){
    
        return shuttingDown;
    }

}
