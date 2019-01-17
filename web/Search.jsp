<%-- 
    Document   : Search
    Created on : 10 Mar, 2017, 1:44:08 PM
    Author     : Pratiksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="css/link.css">
          <link rel="icon" href="IMAGES/11.png" type="image/png" sizes="16x16">
          <style>
              input {
             width: 100%;
           }
           input[type=button] {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 16px 32px;
    text-decoration: none;
    margin: 4px 2px;
    cursor: pointer;
}
input[type=text], input[type=email],input[type=date] {
    width: 100%;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    font-size: 16px;
    background-color: white;
    background-image: url(loc.png);
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
    <li><a href="BusBook.html">Bus Book</a></li>
    <li><a href="PrintTicket.html">Print Ticket</a></li>
    <li><a href="Cancellation.html">Cancel Ticket</a></li>
    <li><a href="Logout1">Logout</a></li>
</ul> 
        <form action="SearchDB.jsp" method="post">
            <div style="alignment-adjust:  middle">
              
            <center> <table>
                    <tr><td>
                            <b> From </b></td><td><input name="t1" type="text"  required="" ><br></td></tr>
                    <tr> <td> <b>To</b></td><td><input type="text" name="t2" required=""><br></td></tr>
                    <tr><td> <b>Date Of Journey</b></td><td><input type="date" name="d1" required pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}" required=""><br></td></tr>
                    <tr><td><b>Date Of Return (optional)</b></td><td><input type="date" name="d2"><br>
                    <tr><td> <b> Email</b></td><td><input type="email" name="email"><br></tr></td>
                    <tr><td></td><td><button type="submit">Search Bus</button></td></tr>
                </table></center>
            </div>
        </form>
    </body>
</html>
