<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>CareOne</title>
        <style>
            .bg{
                max-width: 100%;
                opacity: 0.2;
            }
            .userbox{
                    width:30%;
                    height: 450px;
                    background-color: rgba(0, 0, 0, 0.4);
                    position:absolute;
                    top:250px;
                    left:450px;
                    border-radius: 8px;
            }
            .h2text{
                position: absolute;
                left:20px;
                font-size: 30px;
                color: white;
            }

            
            .h1_main{
                font-size: 90px;
                color:#ee6e6b;
                position: absolute;
                top:10px;
                left:40px;
                
            }
            .pref{
                font-size: 20px;
                position: absolute;
                left:20px;
                top:40px;
                color: white;
            }
            .form-1{
                position: absolute;
                top:150px;
                left:20px;
                font-size: 30px;
                color: white;

            }
            .box-1{
                position: absolute;
                left:30px;
                width: 270px;
                height: 45px;
                border-radius: 50px;
                text-align: center;
            }
            .submit-1{
                position: absolute;
                top:150px;
                left:30px;
                background-color: rgba(0, 0, 0, 0.5);
                color: white;
                width: 270px;
                height: 40px;
                cursor: pointer;
                font-size: 20px;
                border-radius: 50px;
            }
            .button-1{
                position: absolute;
                top:150px;
                left:30px;
                width: 270px;
                height: 40px;
                cursor: pointer;
                background-color: rgba(0, 0, 0, 0.5);
                color: white;
                font-size: 20px;
                border-radius: 50px;

            }
            .Signupbox{
              position: absolute;
              top:200px;
              left:30px;
              width:270px;
              height:22px;
              background-color: rgba(0, 0, 0, 0.3);
              color:white;
              font-size: 15px;
              text-align:center;
              border-radius: 50px;
            }
            .Welcome{
                font-size: 35px;
                color: white;
                position: absolute;
                top:60px;
                left:100px;

            }
        </style>
    </head>
    <body>
        
        <img src="images/3.jpg" class="bg">
        <center><i><h1 class="h1_main">~ Care</i>One ~</h1></center>
     
        <div class="userbox">
            <font>
            <h2 class="h2text">~ <u><i>Care</i>One </u> ~</h2>
            </font>
            <div>
                <p class="Welcome">- Welcome -</p>
            </div>
            <div>
                <form class="form-1" method="post" action="validatedoctor">
                    
                    <input type="text" name="username"  placeholder="Username" class="box-1"> <br><br>
                    <input type="password" name="password"  placeholder="Password" class="box-1"> <br>
                    <input type="submit" name="submit" value="Login" class="submit-1">
                   <a href="DoctorSignup.jsp"> <div class ="Signupbox">
                        Create your account
                        
                    </div></a>
                </form>

            

            
            </div>
        </div>
       

    </body>
</html>