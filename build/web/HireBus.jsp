<%-- 
    Document   : HireBus
    Created on : 11 Mar, 2017, 12:26:53 AM
    Author     : Pratiksha
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hire Bus| MYBUS</title>
        <link rel="icon" href="IMAGES/11.png" type="image/png" sizes="16x16">
           <link rel="stylesheet" href="css/link.css">
        <style>
              input {
             width: 100%;
           }
           input[type=button] {
               width: 100%;
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 16px 32px;
    text-decoration: none;
    margin: 4px 2px;
    cursor: pointer;
}
input[type=text], input[type=email],input[type=date],input[type=radio],input[type=number] {
    width: 100%;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    font-size: 16px;
    background-color: white;
    
    background-position: 10px 10px; 
    background-repeat: no-repeat;
    padding: 12px 20px 12px 40px;
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
          </style>

    </head>
    <body>
        <ul class="nav">
    <li><a href="Bus Hire.html">Bus Hire</a></li>
    <li><a href="HireBus.jsp">Bus Book</a></li>
    <li><a href="PrintTicket.html">Print Ticket</a></li>
    <li><a href="Cancellation.html">Cancel Ticket</a></li>
    <li><a href="Logout1">Logout</a></li>
</ul>
        
        <form action="BusData.jsp" method="post">
            <center>
                <table>
                    <tr><td>
                            <b>Name</b></td><td><input type="text" name="name"></td></tr>
           <tr><td> <b>Email</b></td><td><input type="email" name="b2"></td></tr>
            <tr><td><b>Mobile No</b></td><td><input type="number" name="b3"></td></tr>
        
                    <tr><td> <b>From</b></td><td> <input type="text" name="from">
               </td></tr>
                    <tr><td><b>To</b></td><td> <input  type="text" name="to"></td></tr>
            
           <tr><td><b> Pickup Point</b></td><td><input type="text" name="t2"></td></tr>
           
           <tr><td><b>Distance</b></td><td>
           <select name="km">
  <option value="Select Place" >-----------------Select To Distance -----------------</option>
  
  
    <%
    try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bus", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from hirebus");
           // out.println("<option>");
            
            while (rs.next()) {
                
                out.println("<option>"+ rs.getString(3));
                }
            
            out.println("</option>");
        } 
catch (Exception e) {
            out.println(e);
        }%>
</td></tr>
           
            <tr><td><b>From Date</b></td><td><input type="date" name="d1"></td></tr>
            <tr><td><b>To Date</b></td><td><input type="date" name="d2"></td></tr>
            <tr><td><b>No of persons</b></td><td><input type="number" name="num"></td></tr>
          
            <tr> <td><input type="Submit" value="Submit" ></td></tr>
                </table>
            </center>
        </form>
        
        </div>
    </body>
</html>
