<%-- 
    Document   : Admin
    Created on : 9 Mar, 2017, 5:22:05 PM
    Author     : Pratiksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Data Update</title>
<script type="application/x-javascript">
    addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } 
                            </script>
<!-- //for-mobile-apps -->
<!-- js -->
<link rel="icon" href="IMAGES/11.png" type="image/png" sizes="16x16">
        
<script src="js/jquery-2.1.3.min.js" type="text/javascript"></script>
<!-- //js -->
<link href="css/AdminForm.css" rel="stylesheet" type="text/css" media="all" />
 <link rel="stylesheet" href="css/link.css">
</head>
<body>
    <ul class="nav">
    <li><a href="">Home</a></li>
    <li><a href="Admin.jsp">Update Bus TimeTable</a></li>
    <li><a href="ADisplay.jsp">Display Bus TimeTable</a></li>
    <li><a href="AdminHBD.jsp">Update Bus Data</a></li>
    <li><a href="Logout1">Logout</a></li>

</ul>  
	<div class="main">
		<h1>Details</h1>
		<div class="agileinfo_main">
			<form id="testform" action="AdminData" method="post" novalidate>
				
			
				
				<fieldset style="border: 1px solid #999">
					<legend>Admin</legend>
					
					<p for="firstName" class="w3_field1">From</p>
					<input id="firstName" name="From" type="text" required data-error-msg="Enter Place" />
					
					<p for="phoneNum">To</p>
					<input id="phoneNum" name="To" type="text" required data-error-msg="Enter Place" />
			  
					<p>Arrival  Time</p>
                                        <input id="emailAddress" name="ArrivalTime" type="datetime"  required data-error-msg="Enter Arrival Time " ></input>
			  
					<p for="secondName">Distance</p>
					<input id="secondName" name="Distance" type="number" required data-error-msg="Enter Distance" />
				         <p>Date</p>
                                         <input  name="date" id="D1" type="date"  placeholder="YYYY-MM-DD" required pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}" required data-error-msg="Enter Date " />
			  
					<p for="secondName">Price</p>
					<input  name="price" type="number" required data-error-msg="Enter Amount" />
				
					
					
				
				</fieldset>

                            

                                    <input type="submit" name="Submit" >
                                   

                                    
                              
				
			</form>
		</div>
		<!-- Calendar -->
				<link rel="stylesheet" href="css/jquery-ui.css" />
				<script src="js/jquery-ui.js"></script>
				  <script>
						  $(function() {
							$( "#datepicker" ).datepicker();
						  });
				  </script>
			<!-- //Calendar -->
		<script src="js/attrvalidate.jquery.js" type="text/javascript"></script>
		<!--<script type="text/javascript">
		  $(document).ready(function(){
			$('#testform').attrvalidate();
			$('#resetBtn').click(function(){ $('#testform').attrvalidate('reset'); });
			$('#expandBtn').click(function(){
			  var collapsible = $('#' + $(this).attr('aria-controls'));
			  $(collapsible).attr('aria-hidden', ($(collapsible).attr('aria-hidden') === 'false'));
			  $(this).attr('aria-expanded', ($(this).attr('aria-expanded') === 'false'));
			});
		  });
		</script>!-->
		
	</div>
</body>
</html>