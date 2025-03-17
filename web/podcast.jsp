<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Podcast</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    
    
    <body>
        <%
            String encodedAfricanBlogUrl = (String)request.getAttribute("encodeAB");
            
        %>
        
        
        
        <a href="blogs/<%=encodedAfricanBlogUrl%>">African podcast</a>
        <a href="blogs/europeanblog">European podcast</a>
        <a href="blogs/asianblog">Asian podcast</a>
        
    </body>
</html>

