<%-- 
    Document   : Receipt
    Created on : 18 Mar, 2017, 9:06:54 AM
    Author     : Pratiksha
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Date" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" href="IMAGES/11.png" type="image/png" sizes="16x16">
        
        <link rel="stylesheet" href="css/link.css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Receipt</title>
         <style>
       * {
  box-sizing: border-box;
}

#myInput {
 
  background-position: 10px 10px;
  background-repeat: no-repeat;
  width: 20%;
  font-size: 16px;
  padding: 5px 20px 5px 40px;
  border: 1px solid #ddd;
  margin-bottom: 5px;
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
    <li><a href="Bus Hire.html">Bus Hire</a></li>
    <li><a href="HireBus.jsp">Bus Book</a></li>
    <li><a href="PrintTicket.html">Print Ticket</a></li>
    <li><a href="Cancellation.html">Cancel Ticket</a></li>
    <li><a href="Logout1">Logout</a></li>
</ul>
         <script>
function myFunction() {
  var input, filter, table, tr, td, i;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("myTable");
  tr = table.getElementsByTagName("tr");
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[1];
    if (td) {
      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }       
  }
}
</script>
        <div id="printableArea">
        <%-- Script for Print        --%> 
        <script>
           function printDiv(divName) {
     var printContents = document.getElementById(divName).innerHTML;
     var originalContents = document.body.innerHTML;

     document.body.innerHTML = printContents;

     window.print();

     document.body.innerHTML = originalContents;
} 


        </script>
        
         <h3><b>User</b></h3>  <% String s=(String)session.getAttribute("user");
            out.println(s);
                %>

                <h3><b> Today Date</b> </h3>
                <%
   Date date = new Date();
   out.print( "<h3>" +date.toString()+"</h3>");
%>
        
        
          <div >      
    <center> <h1><b>Hire Bus</b></h1></center>
    <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search Bus Type">
            <table id="myTable" style="width:70%" border="1" align="center">

    <tr class="header">
        <th>Seat</th>
        <th>Bus Type</th>
        <th>Distance</th>
        <th>price</th>
       
    </tr>
    <tr>
    <br>
    <br>

    </tr>
       
        
        
        
        
           <%
        String from = request.getParameter("km");
       // String to = request.getParameter("t2");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bus", "root", "");

            PreparedStatement ps = con.prepareStatement("select * from hirebus where Distance=?");
           ps.setString(1, from);
           // ps.setString(2, to);
           // Statement st=con.createStatement();
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                 out.println("<tr><td><mark>" + rs.getString(1) + "</mark></td><td><mark>" + rs.getString(2) + "</mark></td><td><mark>" + rs.getString(3) + "</mark></td><td><mark>" + rs.getString(4) + "</mark></td></tr>" );
            }

        } catch (Exception e) {
            out.println(e);
        }
    %>
        
        </table>
          
         <%
            String s1 = request.getParameter("name");
            String s2 = request.getParameter("b2");
            String s3 = request.getParameter("b3");
            String s4 = request.getParameter("from");
            String s5 = request.getParameter("to");
            String s6 = request.getParameter("t2");
            String D = request.getParameter("km");
            String s7 = request.getParameter("d1");
            String s8 = request.getParameter("d2");
            String s9 = request.getParameter("num");
        %>
        <center>
        <div style="border-style: solid;
    border-width: 2px; padding: 2px;">
        <h4>Details</h4>
        <b> Name</b>
        <%
        out.println(s1);
        %><br>
        <b>Email </b><%
        out.println(s2);
        %><br>
        <b>Mobile NO </b><%
        out.println(s3);
        %><br>
      <b>  From </b><%
        out.println(s4);
        %><br>
       <b> To  </b><%
        out.println(s5);
        %><br>
       <b> Pickup Point </b> <%
        out.println(s6);
        %><br>
       <b> Distance </b><%
        out.println(D);
        %><br>
        
        From Date <%
        out.println(s7);
        %><br>
        To Date <%
        out.println(s8);
        %><br>
        No of Persons <%
        out.println(s9);
        %><br>
        <br>
        <button style=" 
    bottom: 0px; padding: 15px 32px;text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    " onclick="printDiv('printableArea')"    value="PRINT">Print</button>
    </div>
        </center>
    
        </div>
    
    
    </body>
</html>
