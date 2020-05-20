<!DOCTYPE html>
<html>
<head>
	<link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
    <title>Time Table View</title>
    <script>
	    function resize() {
			var menu = document.getElementById("menu");
			var header = document.getElementById("header");
			var content = document.getElementById("content");
			var container = document.getElementById("scheduler");
			content.style.width = (document.body.offsetWidth-menu.offsetWidth) + "px";
			var height = document.body.offsetHeight-header.offsetHeight+11;
			content.style.height = height + "px";
			container.style.height = (height-150) + "px";
			
			if (scheduler)
				scheduler.setCurrentView();
		};
    	window.onload = resize;
    	window.onresize = resize;
    </script> 
    <style>
    	html, body {
    		margin: 0px;
    		padding: 0px;
    		height: 100%;
    		width: 100%;
    		background-color: #faf7f0;
    		overflow: hidden;
    	}
    	.menu {
	    	width: 234px;
	    	height: 100%;
	    	float: left;
			background-color: #f0ede7;
    	}
    	.menu ul {
    		padding: 10px 0px;
    		margin: 0px;
    		background-color: #e4e1db;
    	}
    	.menu li {
    		list-style-type: none;
    		height: 30px;
    		background-color: #f0ede7;
    		border-bottom: 1px solid #cdcdcd;
    	}
    	.menu li a {
    		width: 100%;
    		height: 100%;
    		display: block;
    		line-height: 30px;
    		padding-left: 10px;
    		box-sizing: border-box;
			padding-left: 20px;
			color: #00829d;
			text-decoration: none;
			font-family: Arial;
			font-size: 14px;
    	}
    	.menu li a:hover {
    		background-image: url("./codebase/demo/menu.png");
    		background-repeat: repeat-x;
    		background-position: 0px 0px;
    		color: #ffffff;
    	}
    	.header {
			width: 100%;
			height: 56px;
			background-image: url("./codebase/demo/header.png");
			background-position: 0px 0px;
			background-repeat: repeat-x;
		}
		.logo {
			background-image: url("./codebase/demo/logo.png");
			background-position: 30px 10px;
			background-repeat: no-repeat;
			width: 250px;
			height: 100%;
		}
		.content {
			background-color: #faf7f0;
			float: left;
			height: 100%;
			width: 100%;
			position: absolute;
			top: 45px;
			left: 234px;
			webkit-border-radius: 5px 0px 0px 0px;
			border-radius: 5px 0px 0px 0px;
			-webkit-box-shadow: -3px 0px 14px rgba(50, 50, 50, 0.1);
			-moz-box-shadow:    -3px 0px 14px rgba(50, 50, 50, 0.1);
			box-shadow:         -3px 0px 14px rgba(50, 50, 50, 0.1);
			padding-top: 20px;
			padding-bottom: 20px;
			padding-right: 20px;
			padding-left: 40px;
			box-sizing: border-box;
		}
		.sample {
			width: 900px;
			height: 80px;
			margin-bottom: 10px;
		}
		.sample .name {
			width: 32%;
			height: 100%;
			font-family: Arial;
			font-size: 24px;
			color: #a54a4a;
			float: left;
			padding: 4px;
			padding-right: 20px;
			box-sizing: border-box;
			background-image: url("./codebase/demo/delimiter.png");
			background-position: right top;
			background-repeat: no-repeat;
		}
		.sample .dsc {
			width: 68%;
			height: 100%;
			font-family: Tahoma;
			font-size: 14px;
			color: #464646;
			float: left;
			padding: 4px;
			padding-left: 20px;
			box-sizing: border-box;
		}
		.scheduler>div {
			border: 1px solid #cecece;
		}
    </style>

</head>
<body style="background:#d2d6de;">
	<div class="header" id="header">
		<div class="logo"></div>
	</div>
	
