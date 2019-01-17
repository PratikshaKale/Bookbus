<%-- 
    Document   : Logout
    Created on : 8 Mar, 2017, 6:40:31 PM
    Author     : Pratiksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="icon" href="IMAGES/11.png" type="image/png" sizes="16x16">
          <script>
            
            function ak()
            {
                
               window.location.assign("Logout.jsp");
            }
        </script>
    </head>
    <body>
        <form action="logout.jsp" method="post" autocomplete="on">
            <%
                 response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
            response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
            response.setDateHeader("Expires", 0); 
            if(session.getAttribute("user")=="1")
            {
                response.sendRedirect("index.html"); return;
            }
            %>
    </body>
</html>
