<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CareOne</title>
<style>
.bg{
	width:100%;
	opacity:0.2;
}
.appointmentbox{
 position:relative;
 top:170px;
 left:120px;
 width: 80%;
 height:300px;
 background-color:rgb(0,0,0,0);
 overflow:hidden;
}
.appointmentbox2{
 position:absolute;
 top:380px;
 left:120px;
 width: 80%;
 height:100px;
 background-color:rgba(0,0,0,0.1);
}

.update{
	background-color:white;
	position:absolute;
	top: 30px;
	right:30px;
	cursor: pointer;;
	width: 90px;
	height:30px;
	font-size:15px;
}
.delete{
	background-color:white;
	position:absolute;
	top: 70px;
	right:30px;
	cursor:pointer;
	width: 90px;
	height:30px;
	font-size:15px;
}

.display-a{
    width:280px;
    height:30px;
    font-size:15px;
    background-color: rgba(0,0,0,0.6);
    color: white;
}
.name-a{
    position: absolute;
    top:10px;
    left:20px;
    font-size: 20px;
}
.email-a{
    position: absolute;
    top:10px;
    left:380px;
    font-size: 20px;

}
.date-a{
    position: absolute;
    top:10px;
    left:740px;
    font-size: 20px;

}
.row-2{
    position: absolute;
    left:20px;
    font-size: 20px;
}
.display{
    width:180px;
    background-color: rgba(0,0,0,0.6);
    color: white;
    background-color: rgba(0,0,0,0.6);
    color: white;
}
.display-date{
    width:80px;
    height:30px;
    background-color: rgba(0,0,0,0.6);
    color: white;
    background-color: rgba(0,0,0,0.6);
    color: white;
    
}
.message{
    font-size: 15px;
    width: 860px;
    height: 160px;
    background-color: rgba(0,0,0,0.6);
    color: white;
}
.message-a{
position: absolute;
left: 20px;
font-size: 20px;
}
.appointmenttable{
    position: absolute;
    top:300px;
    left:5px;
    width:1000px;
    border-radius: 4px;
    background-color: rgba(0,0,0,0.6);
    color:white;
    border-color: white;
}
.trname{
    width:10px;
}
.formbox{
    background-color: rgba(0,0,0,0.1);
    color:white;
}
.bgdiv{
    position: absolute;
    top:1px;
    width: 98%;
    opacity: 0.2;
    border-color: black;
    border: 10px solid blue;
}
.heading{
    position: absolute;
    left:400px;
    font-size: 50px;
    
}
</style>
</head>
<body bgcolor="#DEF2F5">
<p class="heading">- Appointment Details -</p>
<c:forEach var="app" items="${Alist}">
<div class="appointmentbox">

       
        <form action="manageAppointment" method="post">
            <input type="hidden" name="AID" value="${app.getAID()}" ><br>
            <input type="hidden" values="UpdateApp" name="Trigger">
            <div class="name-a">
            <label class="label">Name</label>
                <input type="text" name="Name" class="display-a" value="${app.getName()}">

            </div>

            <div class="email-a">
            <label class="label">Email</label>
                <input type="email" name="Email" class="display-a" value="${app.getEmail()}" readonly>
            </div>
            <br><br>
            
            <div class="date-a">
            <label class="label">Date</label>
                <input type="text" name="Date" value="${app.getDate()}" class="display-date">
            </div>

            <div class="row-2">
            <label class="label">Phone Number</label>
                <input type="text" name="Phone" value="${app.getPhone()}"  class="display" maxlength="10">

            <label>Department</label>
                <input type="text" name="Department" value="${app.getDepartment()}" class="display">
            </div><br><br>
            <div class="message-a">
            <label>Message</label><br>
                <input type="text" name="Message" value="${app.getMessage()}" class="message">
            </div>
            <button class="update">Update</button>
        </form>
            
        
        <form action="manageAppointment" method="post">
            <input type="hidden" name="AID" value="${app.getAID()}" >
             <input type="hidden" value="DeleteApp" name="Trigger">
                <button class="delete">Delete</button>
                
            </form>
        <img src="images/10.jpg" class="bgdiv">
</div>

<br>
</c:forEach>


</body>
</html>
