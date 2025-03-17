
package filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpSession;



@WebFilter(filterName="filternationality", urlPatterns = {"/blogs/*"})
public class FilterNationality implements Filter{

    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
            
        
    }
    
    

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        
       ServletContext context = request.getServletContext();
       String userNationality = (String)context.getAttribute("user-nationality");
       
       if(!"Nigeria".equals(userNationality.trim())){
           
           request.setAttribute("filter-msg", "Sorry this page is restricted to Nigerians");
           request.getRequestDispatcher("/restrictedpage.jsp").forward(request, response);
           
           
           return;
       }
       
       
       
       chain.doFilter(request, response);
    }

    
    
    @Override
    public void destroy(){
                
    }
    
}
