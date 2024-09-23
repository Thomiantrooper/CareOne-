<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CareOne</title>
<style>
.bg{
	width:100%;
	height:800px;
	opacity: 0.8;
}
.appointmentbox{
 position:absolute;
 top:150px;
 left:120px;
 width: 80%;
 height:500px;
 background-color:rgba(0,0,0,0.3);
}

.update{
	background-color:white;
	position:absolute;
	bottom: 70px;
	right:30px;
	cursor:pointer;
	width: 300px;
	height:50px;
	font-size:20px;
}

.textforcontactus{
position:absolute;
top:20px;
left:450px;
font-size:50px;
}
.display{
    font-size: 25px;
    width:400px;
    height:50px;
    background-color: rgba(0,0,0,0.6);
    color: white;
    text-align: center;
}
.label{
    font-size:30px;
}
.name-d{
    position: absolute;
    top:10px;
    left:50px;
}

.phone-d{
    position: absolute;
    top:10px;
    right:50px;
}
.userp{
    position: absolute;
    left:350px;
    color:white;
    background-color: rgba(0,0,0,0.6);
    width: 320px;
    height: 50px;
    font-size: 16px;
    }
</style>
</head>
<body>
    <img src="images/12.jpg" class="bg">
<div class="textforcontactus">
- Profile Details -
</div>

<div class="appointmentbox">
  
        <div>
        <form method="post" action="updateUser">
            <input type="hidden" placeholder="username" class="display"><br>
            <input type="hidden" name="id" value='${User.getId()}'/>
            
            <div class="name-d">
                <br><br><center>
            <label class="label">- Name -</label><br>
                <input type="text" class="display" value='${User.getName()}' name="name"><br>
            </center>
            </div>

            <div class="phone-d">
                <br><br><center>
            <label class="label">- Phone Number -</label><br>
                <input type="text"  class="display" maxlength="10" value='${User.getPhonenumber()}' name="phone"><br>
            </center>
            </div>
            <br><br><br><br><br><br><br><br>
            <center>
                
            <label class="label">- Username -</label><br>
                <div class="userp"><p>${User.getUsername()}</p></div>
                <br><br><br>
            <label class="label">- Password - </label><br>
                <input type="text" class="display" value='${User.getPassword()}' name="pass">
                <button class="update">Update</button>
        </form>
        
        </div>
    </center>


</body>
</html>