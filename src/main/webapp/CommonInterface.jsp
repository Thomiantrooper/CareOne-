<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
    <head>
        <title>CareOne</title>
        <style>
            .bg{
                max-width: 100%;
                opacity: 0.3;
            }
            .userbox{
                    width:500px;
                    height: 300px;
                    background-color: rgba(0, 0, 0, 0.1);
                    position:absolute;
                    top:350px;
                    left:150px;
            }
            .h1text{
                font-size: 120px;
                color: #2b2b2b;
            }

            .doctorbox{
                    width:500px;
                    height: 300px;
                    background-color: rgba(0, 0, 0, 0.1);
                    position:absolute;
                    top:350px;
                    right:150px;
            }
            .h1_main{
                font-size: 90px;
                color:#ee6e6b;
                position: absolute;
                top:10px;
                left:40px;
                
            }
            .aboutus{
            	position:absolute;
            	right:20px;
            	background-color:rgba(0,0,0,0.1);
            	text-align:center;
            	width:200px;
            	height:60px;
            	font-size:20px;
            	cursor:pointer;
            	color:black;
            	
            }
        </style>
    </head>
    <body>
    <a href="About.jsp">
        <div class="aboutus">
        	<b><p>About Us</p></b>
        </div>
        </a>
        <img src="images/1.jpg" class="bg">
        <center><i><h1 class="h1_main">~ Care</i>One ~</h1></center>
        <a href="UserLogin.jsp">
        <div class="userbox">
            <font>
            <center><h1 class="h1text">User</h1></center>
            </font>
        </div>
        </a>

        <a href="DoctorLogin.jsp">
            <div class="doctorbox">
                <font>
                <center><h1 class="h1text">Doctor</h1></center>
                </font>
            </div>
            </a>

    </body>
</html>