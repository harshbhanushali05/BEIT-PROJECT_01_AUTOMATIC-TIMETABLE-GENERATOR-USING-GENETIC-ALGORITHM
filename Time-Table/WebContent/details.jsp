<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Time-Table</title>
  <script type="text/javascript" src="js/jquery.cookie.js"></script>
  		
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
 <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>  

  </head>

<body style="background:#d2d6de;">
<div class="container">
<jsp:include page="menu.jsp"></jsp:include>


<div class="row" style="margin-top: 25px;">
   <div class="col-sm-12">
       <a href="uploadImage.jsp" class="pull-left"><button class="btn btn-primary">Back</button></a>
       <a href="GenerateTimeTableServelet" class="pull-right"><button class="btn btn-primary">Continue</button></a>
       
   </div>
</div>
 <div class="row" style="margin-top: 5px;background:white;padding: 5px;">
 	 
   	  <div class="col-sm-12">
           <table class="table no-border">
             <thead>
              <tr>
                 <th>NO</th>
                 <th>Subject Abbreviation</th>
                 <th>Prof Abbreviation</th>
                 <th>L/P</th>
                 <th>LOAD</th>
                 <th>YEAR</th>
              </tr>
             </thead>
             <tbody>
                <c:forEach items="${detailsList}" var="details">
                <tr>
                  <c:forEach items="${details}" var="arr" >
                    <td>${arr}</td>
                  </c:forEach>
                </tr>
                </c:forEach>
             </tbody>
           </table> 
   	  </div>
   </div>
 </div>
 
	
</body>
<script type="text/javascript">


</script>
</html>

