<%-- 
    Document   : Seat
    Created on : 13 Mar, 2017, 4:54:00 PM
    Author     : Pratiksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <link rel="icon" href="IMAGES/11.png" type="image/png" sizes="16x16">
       <link rel="stylesheet" href="css/link.css">
        <title>JSP Page</title>
        <style>
            body {
  
  font-size: 12px;
}

h1 {
  color: #eee;
  font: 30px Arial, sans-serif;
  text-shadow: 0px 1px black;
  text-align: center;
}

input[type=checkbox] {
  visibility: hidden;
}

.containerbus {
  display: flex;
  justify-content: center;
}

.autobus {
  background: lightgray;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  width: 120px;
  height: 200px;
}

.fila {
  display: flex;
  justify-content: space-between;
}

.seccion {
  display: flex;
  width: 40%;
  justify-content: space-between;
}

.asiento {
  width: 21px;
  height: 21px;
  color: white;
  font-size: 10;
  text-align: center;
  background: #fcfff4;
  background: linear-gradient(top, #fcfff4 0%, #dfe5d7 40%, #b3bead 100%);
  margin: 5px auto;
  box-shadow: inset 0px 1px 1px white, 0px 1px 3px rgba(0, 0, 0, 0.5);
  position: relative;
}

.asiento label {
    color: black;
  cursor: pointer;
  position: absolute;
  width: 15px;
  height: 15px;
  left: 3px;
  top: 3px;
  box-shadow: inset 0px 1px 1px rgba(0, 0, 0, 0.5), 0px 1px 0px rgba(255, 255, 255, 1);
  background: linear-gradient(top, #222 0%, #45484d 100%);
}

.asiento label:after {
  filter: alpha(opacity=0);
  opacity: 0;
  content: '';
  position: absolute;
  width: 15px;
  height: 15px;
  background: skyblue;
  background: linear-gradient(top, #0895d3 0%, #0966a8 100%);
  top: 0px;
  left: 0px;
  box-shadow: inset 0px 1px 1px white, 0px 1px 3px rgba(0, 0, 0, 0.5);
}

.asiento label:hover::after {
  filter: alpha(opacity=30);
  opacity: 0.3;
}

.asiento input[type=checkbox]:checked + label:after {
  filter: alpha(opacity=100);
  opacity: 1;
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
<h1>Select your seat</h1>
<div class="containerbus">
  <!-- Squared ONE -->
  <div class="autobus">
      <form method="post" action="TicketData.jsp">
    <div class="fila">
      <div class="seccion">
        <div class="asiento">
          <input type="checkbox" value="None" disabled="disabled"  id="asiento1" name="check" checked />
          <label for="asiento1">1</label>
        </div>
        <div class="asiento">
          <input type="checkbox" value="AA" id="asiento2" name="check" />
          <label for="asiento2">2</label>
        </div>
      </div>
      <div class="seccion">
        <div class="asiento">
          <input type="checkbox" value="AB" id="asiento3" name="check" />
          <label for="asiento3">3</label>
        </div>
        <div class="asiento">
          <input type="checkbox" value="None" disabled="disabled"  id="asiento4" name="check" checked />
          <label for="asiento4">4</label>
        </div>
      </div>
    </div>

    <div class="fila">
      <div class="seccion">
        <div class="asiento">
          <input type="checkbox" value="AC" id="asiento5" name="check" />
          <label for="asiento5">5</label>
        </div>
        <div class="asiento">
          <input type="checkbox" value="AD" id="asiento6" name="check" />
          <label for="asiento6">6</label>
        </div>
      </div>
      <div class="seccion">
        <div class="asiento">
          <input type="checkbox" value="AF" id="asiento7" name="check" />
          <label for="asiento7">7</label>
        </div>
        <div class="asiento">
          <input type="checkbox" value="AG" id="asiento8" name="check" />
          <label for="asiento8">8</label>
        </div>
      </div>
    </div>

    <div class="fila">
      <div class="seccion">
        <div class="asiento">
          <input type="checkbox" value="AH" id="asiento9" name="check" />
          <label for="asiento9">9</label>
        </div>
        <div class="asiento">
          <input type="checkbox" value="AI" id="asiento10" name="check" />
          <label for="asiento10">10</label>
        </div>
      </div>
      <div class="seccion">
        <div class="asiento">
          <input type="checkbox" value="AJ" id="asiento11" name="check" />
          <label for="asiento11">11</label>
        </div>
        <div class="asiento">
          <input type="checkbox" value="AK" id="asiento12" name="check" />
          <label for="asiento12">12</label>
        </div>
      </div>
    </div>

    <div class="fila">
      <div class="seccion">
        <div class="asiento">
          <input type="checkbox" value="AL" id="asiento13" name="check" />
          <label for="asiento13">13</label>
        </div>
        <div class="asiento">
          <input type="checkbox" value="AM" id="asiento14" name="check" />
          <label for="asiento14">14</label>
        </div>
      </div>
      <div class="seccion">
        <div class="asiento">
          <input type="checkbox" value="None" disabled="disabled"  id="asiento15" name="check" checked/>
          <label for="asiento15">15</label>
        </div>
        <div class="asiento">
          <input type="checkbox" value="None" disabled="disabled"  id="asiento16" name="check" checked/>
          <label for="asiento16">16</label>
        </div>
      </div>
    </div>

    <div class="fila">
      <div class="seccion">
        <div class="asiento">
          <input type="checkbox" value="AN" id="asiento17" name="check" />
          <label for="asiento17">17</label>
        </div>
        <div class="asiento">
          <input type="checkbox" value="AO" id="asiento18" name="check" />
          <label for="asiento18">18</label>
        </div>
      </div>
      <div class="seccion">
        <div class="asiento">
          <input type="checkbox" value="AP" id="asiento19" name="check" />
          <label for="asiento19">19</label>
        </div>
        <div class="asiento">
          <input type="checkbox" value="AQ" id="asiento20" name="check" />
          <label for="asiento20">20</label>
        </div>
      </div>
    </div>

    <div class="fila">
      <div class="seccion">
        <div class="asiento">
          <input type="checkbox" value="AR" id="asiento21" name="check" />
          <label for="asiento21">21</label>
        </div>
        <div class="asiento">
          <input type="checkbox" value="22" id="asiento22" name="check" />
          <label for="asiento22">22</label>
        </div>
      </div>
      <div class="seccion">
        <div class="asiento">
          <input type="checkbox" value="23" id="asiento23" name="check" />
          <label for="asiento23">23</label>
        </div>
        <div class="asiento">
          <input type="checkbox" value="24" id="asiento24" name="check" />
          <label for="asiento24">24</label>
        </div>
      </div>
        
    </div>
          
      </form>
  </div>
</div>
<center><button onClick="window.location='TicketData.jsp'; " value="Pay Now">GO</button></center>
<center><table>
    <tr><td><b>SELECTED SEAT</b><div class="asiento">
              <input type="checkbox" value="None" disabled="disabled"  id="asiento4" name="check" checked />
          <label for="asiento4">4</label>
            </div>  </td></tr></table>  </center>   
<%!String check[];%>


</body>
</html>
