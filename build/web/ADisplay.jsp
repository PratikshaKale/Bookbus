<%-- 
    Document   : AdminData
    Created on : 11 Mar, 2017, 11:48:51 PM
    Author     : Pratiksha
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/link.css">
        <link rel="icon" href="IMAGES/11.png" type="image/png" sizes="16x16">
        <style>
            * {
  box-sizing: border-box;
}

#myInput {
  background-image: url('/css/searchicon.png');
  background-position: 10px 10px;
  background-repeat: no-repeat;
  width: 100%;
  font-size: 16px;
  padding: 12px 20px 12px 40px;
  border: 1px solid #ddd;
  margin-bottom: 12px;
}

#myTable {
  border-collapse: collapse;
  width: 100%;
  border: 1px solid #ddd;
  font-size: 18px;
}

#myTable th, #myTable td {
  text-align: left;
  padding: 12px;
}

#myTable tr {
  border-bottom: 1px solid #ddd;
}

#myTable tr.header, #myTable tr:hover {
  background-color: #f1f1f1;
}
body {
    background-image: url("IMAGES/first.jpg");
     background-repeat: no-repeat;
    background-attachment: fixed;
    background-position:center center;
-webkit-background-size: cover;
-moz-background-size: cover;
-o-background-size: cover;
background-size: cover;
 
            }
            mark { 
                background-color:#ddd;
    color: black;
}
        </style>
        
    </head>
    <body>
          <ul class="nav">
    <li><a href="">Home</a></li>
    <li><a href="Admin.jsp">Update Bus TimeTable</a></li>
    <li><a href="ADisplay.jsp">Display Bus TimeTable</a></li>
    <li><a href="AdminHBD.jsp">Update Bus Data</a></li>
    <li><a href="Logout1">Logout</a></li>

</ul>
        <table id="myTable" style="width:70%" border="1" align="center">

    <tr class="header">
        <th>From</th>
        <th>To</th>
        <th>Arrival  Time</th>
        <th>Distance</th>
        <th>Date</th>
        <th>price</th>
       

    </tr>
    <tr>
    <br>
    <br>

    </tr>
       
        
        
        
        
         <%
       

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bus", "root", "");

            PreparedStatement ps = con.prepareStatement("select * from bdata1");
           
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                 out.println("<tr><td><mark>" + rs.getString(1) + "</mark></td><td><mark>" + rs.getString(2) + "</mark></td><td><mark>" + rs.getString(3) + "</mark></td><td><mark>" + rs.getString(4) + "</mark></td><td><mark>"+rs.getString(5)+"</mark></td><td><mark><a href=BUS.jsp>" + rs.getString(6) + "</a></mark></td></tr>" );
            }

        } catch (Exception e) {
            out.println(e);
        }
    %>
    </body>
</html>
