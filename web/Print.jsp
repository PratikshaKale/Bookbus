<%-- 
    Document   : Print
    Created on : 11 Mar, 2017, 6:28:49 PM
    Author     : Pratiksha
--%>
<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head id="Head1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/link.css">
<link rel="stylesheet" href="css/Design.css">
   
   <link rel="icon" href="IMAGES/11.png" type="image/png" sizes="16x16">
  
 
<style>
            body {
    background-image: url("/IMAGES/images.jpg");
     background-repeat: no-repeat;
    background-attachment: fixed;
    background-position:center center;
-webkit-background-size: cover;
-moz-background-size: cover;
-o-background-size: cover;
background-size: cover;
 font: normal 14px/1.4 'Lato';
            }
            .search_btn{height:50px;width:125px;border-width:0;background-color:#d74f57;color:#f8d1ce;margin-top:2em;margin-left:75%}
       .container h2{margin:auto;margin-left:41%;color:#757575;padding-top:3em}
.container h3{margin-left:40%;margin-top:0;color:#9c9c9c}
.container{width:100%;min-height:500px;background-color:hsla(0,0%,95%,.45)}
.search-box{position:relative;width:226px;border:1px solid #d2d2d2;height:50px;background-color:#fff;left:34%;box-shadow:1px 2px 3px #888}.fl{float:left}


</style>
        <script>
           function printDiv(divName) {
     var printContents = document.getElementById(divName).innerHTML;
     var originalContents = document.body.innerHTML;

     document.body.innerHTML = printContents;

     window.print();

     document.body.innerHTML = originalContents;
} 


        </script>
</head>
<body>
    <ul class="nav">
    <li><a href="Bus Hire.html">Bus Hire</a></li>
    <li><a href="BusBook.html">Bus Book</a></li>
    <li><a href="PrintTicket.html">Print Ticket</a></li>
    <li><a href="Cancellation.html">Cancel Ticket</a></li>
    <li><a href="Logout1" >Logout</a></li>
</ul>   
    <section id="rh_main">
        
        <div id="mBWrapper">


<div class="container">
    <h2 style="color: black;">Print Bus Ticket</h2><br>
    <h3  style="color: black;">Please enter your ticket number below</h3>

<form action="" id="searchForm" method="post"name="myForm"onsubmit="return validateForm()">  
    <div id="printableArea" class="db">
    <div class="fl search-box" style="border-color: rgb(210, 210, 210);">
     
        
    <br>
        <div>
            <% String s=(String)session.getAttribute("user");
            out.println(s);
                %>

                <h1> Today Date </h1>
                <%
   Date date = new Date();
   out.print( "<h2 align=\"center\">" +date.toString()+"</h2>");
%>
        </div>
                    <span class="errorMessageOptions"></span>
                    <input type="submit" onclick="printDiv('printableArea')" value="SUBMIT" class="search_btn">
                </div>
</div>
        </div>
</form>    
</div>
</div>
</section>
     
</body>
</html>
