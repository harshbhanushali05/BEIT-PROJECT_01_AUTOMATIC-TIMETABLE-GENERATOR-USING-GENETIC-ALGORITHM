<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>HOD Page</title>

    <!-- Bootstrap Core CSS -->
    <link href="bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	 <!-- Datepicker  -->
	
	
	  <!-- <script type="text/javascript" src="dist/js/datepicker.js"></script>
	    <script type="text/javascript" src="dist/js/site.js"></script> -->
	 
	   
	     <!--Css files-->
   
   
   
    <link rel="Stylesheet" href="dist/css/font-awesome.css" />

    <!--Js Files-->
    <script type="text/javascript" src="dist/js/jquery-2.1.3.min.js"></script>
    <script type="text/javascript" src="dist/js/jquery-ui.js"></script>
  
    <!-- <script type="text/javascript" src="dist/js/datepicker.js"></script> -->
    <script type="text/javascript" src="dist/js/jquery.nicescroll.js"></script>
   
   
<style type="text/css">
td{
 text-align: center;
 } 
 .beforeBreakTr{
 	border-right:1px solid gray!important;
 }
 .breakTr{
	 border:none!important;
	 border-right:1px solid gray!important;
	 background: white!important;
 }
</style>
    

</head>




<body style="background:#d2d6de;">


<div id="wrapper">
 <jsp:include page="menu.jsp"></jsp:include>
		<div class="row">
                 <div class="col-md-10 col-md-offset-1">
                    <div class="panel panel-red">
                        <div class="panel-heading">
                         
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="row">
                           		<label class="col-sm-12" style="text-align:center;">DEPARTMENT OF INFORMATION TECHNOLOGY
                           		&nbsp;&nbsp;(&nbsp;${param.key} IT&nbsp;) 
                           		<span>&nbsp;&nbsp;SEM ${param.key=='SE'?'IV':param.key=='TE'?'VI':'VIII'} &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; 2019-20</span>
                           		</label>
                           </div>
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                        <tr>
                                            <th style="text-align:center;">TIME/DAY</th>
                                            <th>9.10 to 10.05</th>
                                            <th>10.05 to 11.00</th>
                                            <th>11.00 to 11.55</th>
                                            <th>11.55 <br>- 12.25</th>
                                            <th>12.25 to 1.20</th>
                                            <th>1.20 to 2.15</th>
                                            <th>2.15 to 3.10</th>
                                            <th>3.10 <br>- 3.30</th>
                                            <th>3.30 to 4.25</th>
                                            <th>4.25 to 5.20</th>
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
                                  
                                    	<tr style="height: 70px;">
                                            <td style="font-weight:bold;">Monday</td>
                                            <td id="00"></td>
                                            <td id="01"></td>
                                            <td id="02" class="beforeBreakTr"></td>
                                            <td class="breakTr"></td>
                                            <td id="03"></td>
                                            <td id="04"></td>
                                            <td id="05" class="beforeBreakTr"></td>
                                            <td class="breakTr"></td>
                                            <td id="06"></td>
                                            <td id="07"></td>
                                        </tr>
                                        <tr style="height: 70px;">
                                            <td style="font-weight:bold;">Tuesday</td>
                                             <td id="10"></td>
                                            <td id="11"></td>
                                            <td id="12" class="beforeBreakTr"></td>
                                            <td class="breakTr"></td>
                                            <td id="13"></td>
                                            <td id="14"></td>
                                            <td id="15" class="beforeBreakTr"></td>
                                            <td class="breakTr" ></td>
                                            <td id="16"></td>
                                            <td id="17"></td>
                                        </tr>
                                        <tr style="height: 70px;">
                                            <td style="font-weight:bold;">Wednesday</td>
                                            <td id="20"></td>
                                            <td id="21"></td>
                                            <td id="22" class="beforeBreakTr"></td>
                                            <td class="breakTr"></td>
                                            <td id="23"></td>
                                            <td id="24"></td>
                                            <td id="25" class="beforeBreakTr"></td>
                                            <td class="breakTr" ></td>
                                            <td id="26"></td>
                                            <td id="27"></td>
                                        </tr>
                                        <tr style="height: 70px;">
                                            <td style="font-weight:bold;">Thursday</td>
                                             <td id="30"></td>
                                            <td id="31"></td>
                                            <td id="32" class="beforeBreakTr"></td>
                                            <td class="breakTr"></td>
                                            <td id="33"></td>
                                            <td id="34"></td>
                                            <td id="35" class="beforeBreakTr"></td>
                                            <td class="breakTr"></td>
                                            <td id="36"></td>
                                            <td id="37"></td>
                                        </tr>
                                        <tr style="height: 70px;">
                                            <td style="font-weight:bold;">Friday</td>
                                             <td id="40"></td>
                                            <td id="41"></td>
                                            <td id="42" class="beforeBreakTr"></td>
                                            <td class="breakTr"></td>
                                            <td id="43"></td>
                                            <td id="44"></td>
                                            <td id="45" class="beforeBreakTr"></td>
                                            <td class="breakTr"></td>
                                            <td id="46"></td>
                                            <td id="47"></td>
                                        </tr>
                                       
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
						
                        <!-- /.panel-body -->
                  
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>

</div>
    <!-- jQuery -->
    <script src="bower_components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="dist/js/sb-admin-2.js"></script>

	<!-- Page-Level Demo Scripts - Notifications - Use for reference -->
    <!-- <script>
    // tooltip demo
    $('.tooltip-demo').tooltip({
        selector: "[data-toggle=tooltip]",
        container: "body"
    })

    // popover demo
    $("[data-toggle=popover]")
        .popover()
    </script> -->
    
    
    <script type="text/javascript">
     $(document).ready(function(){
    	 
    	 var year = "${param.key}";
    	 var classRoom  = year=="SE"?206:year=="TE"?307:401
    	 $.ajax({
    		url:"GenerateTimeTableServelet",
    		method : "post",
    		//contentType:'application/json',
    		data:{key:year},
    		success:function(timeTable){
    			
    			//console.log(timeTable)
    			for(var i = 0; i < timeTable.length;i++){
    				for(var j = 0; j < timeTable[i].length;j++){
    					 if(timeTable[i][j]!="N/A")	{
    						 var data = timeTable[i][j].split("#");
    				     	$("#"+j+i).html(classRoom+"<br>"+data[1]+"<br>"+data[0]);
    					 }
    				}
    			}
    			
    			
    			
    		}
    	 });
     })
    
    </script>
</body>

</html>





