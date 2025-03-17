

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>restricted</title>
    </head>
    <body>
        <%
            String msg = (String)request.getAttribute("filter-msg");
        %>
        <h5><%=msg%></h5>
        
        <a href="/FilterApp/podcast.html">Go to podcasts</a>
    </body>
</html>
