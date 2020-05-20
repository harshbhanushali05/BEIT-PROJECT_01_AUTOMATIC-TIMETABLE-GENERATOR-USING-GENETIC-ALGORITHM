<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Time-Table</title>
  
  		
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
 <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>  

  </head>

<body style="background:#d2d6de;">
<div class="container">
<jsp:include page="menu.jsp"></jsp:include>
 <div class="row" style="margin-top:120px;">
 	<div class="col-sm-4"></div>
   	  <div class="col-sm-4" style="background: white;padding:25px;border-radius:4px;">
      <form action="ImageUploadServlet" method="post" enctype="multipart/form-data">
		Upload File <input type="file" id="name" class="form-control" alt="1" name="name" required/><br/>
		<button type="submit" class="btn btn-success" value="upload">Submit</button>
	</form>
   	  </div>
   	  <div class="col-sm-4" style="margin-top:5px;">
   	      <button type="button" class="btn btn-primary" onclick="downloadTradeFile();">Downlaod Sample</button>
   	  </div>
   </div>
 </div>
 
	
</body>
<script type="text/javascript">
function downloadTradeFile(){
	window.location="ImageUploadServlet";
}


</script>
</html>

