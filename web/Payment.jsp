<%-- 
    Document   : Payment
    Created on : 9 Mar, 2017, 9:58:35 AM
    Author     : Pratiksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<title>Payment</title>
<link rel="icon" href="IMAGES/11.png" type="image/png" sizes="16x16">
<link rel="stylesheet" href="css/link.css">
<style>
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
    <br>
    <br>
<center>  <div style="border-style: solid; 
    border-width: 2px; width: 350px;">
		
               <form action="Receipt.jsp" method="post"> 
            
                Enter your Credit card details
                <table width="490px" border="0" cellspacing="10" cellpadding="0">
                  <tbody>
                      <tr height="32">
                          <td width="100px"><b>Credit Card No  </b> </td>
                    <td colspan="3">
                        <div  style=" overflow:hidden;"> 
                           
                          <input  type="text" maxlength="19" size="20" name="card_number_1"  placeholder="" autocomplete="off">
                         
                           </div>
                    </td>
                  </tr>
                  <tr height="32">
                      <td><b>Expiry Date </b></td>
                    <td colspan="3"><span >
                        <select  name="exp_month_1" >
                          <option value="">Month </option>
                          <option value="01">01 (Jan)</option>
                          <option value="02">02 (Feb)</option>
                          <option value="03">03 (Mar)</option>
                          <option value="04">04 (Apr)</option>
                          <option value="05">05 (May)</option>
                          <option value="06">06 (Jun)</option>
                          <option value="07">07 (Jul)</option>
                          <option value="08">08 (Aug)</option>
                          <option value="09">09 (Sep)</option>
                          <option value="10">10 (Oct)</option>
                          <option value="11">11 (Nov)</option>
                          <option value="12">12 (Dec)</option>
                        </select>&nbsp;&nbsp;
                        <select  name="exp_year_1" >
                          <option value="">Year </option>
                              <option value="17">2017</option>
                                                        <option value="18">2018</option>
                                                        <option value="19">2019</option>
                                                        <option value="20">2020</option>
                                                        <option value="21">2021</option>
                                                        <option value="22">2022</option>
                                                        <option value="23">2023</option>
                                                        <option value="24">2024</option>
                                                        <option value="25">2025</option>
                                                        <option value="26">2026</option>
                                                        <option value="27">2027</option>
                                                        <option value="28">2028</option>
                                                        <option value="29">2029</option>
                                                        <option value="30">2030</option>
                                                        <option value="31">2031</option>
                                                        <option value="32">2032</option>
                                                        <option value="33">2033</option>
                                                        <option value="34">2034</option>
                                                        <option value="35">2035</option>
                                                        <option value="36">2036</option>
                                                        <option value="37">2037</option>
                                                        <option value="38">2038</option>
                                                        <option value="39">2039</option>
                                                        <option value="40">2040</option>
                                                        <option value="41">2041</option>
                                                        <option value="42">2042</option>
                                                        <option value="43">2043</option>
                                                        <option value="44">2044</option>
                                                        <option value="45">2045</option>
                                                        <option value="46">2046</option>
                                                        <option value="47">2047</option>
                                                        <option value="48">2048</option>
                                                        <option value="49">2049</option>
                                                        <option value="50">2050</option>
                                                        <option value="51">2051</option>
                                                    </select>
                      </span>
                  </td></tr>
                  <tr height="32">
                      <td><b>CVV </b> </td>
                    <td colspan="3"><span>
						
                   <table>
                       <tbody>
                           <tr><td>
                                   <input type="password" name="cvv_1"  placeholder="" maxlength="4"  size="6" autocomplete="off">
                               </td>
                               <td>
                       
                      
                        
                      </td>
                           </tr>
                       </tbody>
                   </table>
                        </span></td>
                  </tr>
                  <tr height="32">
                      <td><b>Name on Card </b></td>
                    <td colspan="3"><span>
                        <input type="text" name="name_on_card_1"   placeholder=""  size="20" autocomplete="off">
                      </span></td>
                  </tr>
                  </tbody></table>
                <center><button onClick="window.location=''; " value="Pay Now">PAY NOW</button></center>
               </form>
              </div>
        </center>

</body>
</html>
