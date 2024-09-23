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
    position: absolute;
    top:1px;
    border:10px solid blue;
	width:98%;
    height: 380px;
	opacity:0.2;
   
}
.appointmentbox{
 position:relative;
 top:170px;
 left:120px;
 width: 80%;
 height:400px;
 background-color:rgba(0,0,0,0.1);
}
.appointmentbox2{
 position:absolute;
 top:380px;
 left:120px;
 width: 80%;
 height:700px;
 background-color:rgba(0,0,0,0.1);
}
.update{
	background-color:white;
	position:absolute;
	top: 30px;
	right:30px;
	cursor:pointer;
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
.displaysubject{
    position: absolute;
    top:50px;
    left:30px;
    width:800px;
    height: 30px;
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
    position: absolute;
    left:30px;
    top:170px;
    font-size: 15px;
    width: 860px;
    height: 200px;
    background-color: rgba(0,0,0,0.6);
    color: white;
}
.message-a{
position: absolute;
left: 20px;
font-size: 20px;
}
.textforcontactus{
position:absolute;
top:60px;
left:450px;
font-size:50px;
}
.message-b{
position: absolute;
top:120px;
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
</style>
</head>
<body>
    <div class="textforcontactus">
        - Support Details -
        </div>
<c:forEach var="sup" items="${Slist}">
<div class="appointmentbox">

    
        <form action="manageSupport" method="post">
            <input type="hidden" name="SID" value="${sup.getSID()}" ><br>
            <input type="hidden" value="UpdateApp" name="Trigger">


            <div class="name-a">
            <label class="label">Name</label>
                <input type="text" name="Name" class="display-a" value="${sup.getName()}">

            </div>

            <div class="email-a">
            <label class="label">Email</label>
                <input type="email" name="Email" class="display-a" value="${sup.getEmail()}" readonly>
            </div>
            <br>
            

            
                <div class="message-a">
                    <p>Subject</p>
                        <input type="text" name="Subject" value="${sup.getSubject()}" class="displaysubject">
                    </div>
                    
                   <div class="message-b"> <p>Message</p></div>
                <input type="text" name="Message" value="${sup.getMessage()}" class="message">
            <br><br>
            
            <button class="update">Update</button>
        </form>
            <img src="images/11.jpg" class="bg">

 <form action="manageSupport" method="post">
        <input type="hidden" name="SID" value="${sup.getSID()}" >
         <input type="hidden" value="DeleteSup" name="Trigger">
        	<button class="delete">Delete</button>
        </form>

        
</div>

<br>
</c:forEach>


</body>
</html>