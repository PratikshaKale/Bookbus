<%-- 
    Document   : TicketData
    Created on : 12 Mar, 2017, 1:33:20 PM
    Author     : Pratiksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TicketData Bus| MYBUS</title>
       <link rel="icon" href="IMAGES/11.png" type="image/png" sizes="16x16">
       <link rel="stylesheet" href="css/link.css">
        <style>
              input {
             width: 100%;
           }
           input[type=button] {
               width: 50%;
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
         <% String s=(String)session.getAttribute("user");
            out.println(s);
                %>
        <form action="Payment.jsp" method="post">
            <center><table >
                <tr><td>
                        Name</td><td><input type="text" name="n1" ></td><br></tr>
           <tr><td> Gender</td>
               <td><input type="text" name="n5"></td></tr>
           <tr><td> Age</td><td><input type="number" name="n2"><br></td></tr>
           <tr><td>Email</td><td><input type="email" name="e1"></br></td></tr>
           <tr><td>Phone No</td><td><input type="number"name="n3"></td></tr>
           <tr><td>Amount</td><td><input type="text" name="n4"><br></td></tr>
            <tr><td> Seat no</td><td>
                         <%!
String check[];
%>
<%
String check[]= request.getParameterValues("check");
if(check != null)
{
%>
<h4>You selected subject </h4>
<ul>
<%
for(int i=0; i<check.length; i++)
{
%>
<li><%=check[i]%></li>
<%
}
%>
</ul>
<%
}
%>
</td></tr>
            <tr><td></td><td>
                    <input type="Submit" value="Submit"></td></tr>
            </table>
            </center>
        </form>
    </body>
</html>
