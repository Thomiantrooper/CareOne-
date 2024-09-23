<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
.contactbox{
 position:relative;
 top:100px;
 left:120px;
 width: 80%;
 height:400px;
 background-color:rgba(0,0,0,0.1);
}
.contactbox1{
 position:absolute;
 top:500px;
 left:120px;
 width: 80%;
 height:200px;
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
	top: 80px;
	right:30px;
	cursor:pointer;
	width: 90px;
	height:30px;
	font-size:15px;
}
.textforcontactus{
position:absolute;
top:20px;
left:450px;
font-size:50px;
}
.contacttable{
    position: absolute;
    top:450px;
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
    width:240px;
}

.display-a{
    width:280px;
    height:30px;
    font-size:15px;
    background-color: rgba(0,0,0,0.6);
    color: white;
}
.display{
    width:750px;
    height: 30px;
    background-color: rgba(0,0,0,0.6);
    color: white;
    
}
.message{
    position: absolute;
    left:65px;
    font-size: 15px;
    width: 750px;
    height: 250px;
    background-color: rgba(0,0,0,0.6);
    color: white;
}
.email-a{
    position: absolute;
    top:10px;
    left:380px;
    font-size: 20px;

}
.name-a{
    position: absolute;
    top:10px;
    left:20px;
    font-size: 20px;
}
.row-2{
    position: absolute;
    left:20px;
    font-size: 20px;
    
}
.message-a{
position: absolute;
left: 20px;
font-size: 20px;
}

</style>
</head>
<body bgcolor="#E2FOF9">
<div class="textforcontactus">
- Contactus Details -
</div>

<c:forEach var="cont" items="${Clist}">

<div class="contactbox">
    <div>
        <form>
            <form action="manageContactus" method="post">
            <input type="hidden" name="CID" value="${cont.getCID()}" ><br>
            <input type="hidden" values="UpdateCont" name="Trigger">
            
            <div class="name-a">
            <label class="label">Name</label>
               <input type="text" name="Name" class="display-a" value="${cont.getName()}">


            </div>

            <div class="email-a">
            <label class="label">Email</label>
                <input type="email" name="Email" class="display-a" value="${cont.getEmail()}" readonly>
            </div>
            <br><br>
            

            <div class="row-2">
            <label class="label">Subject</label>
                <input type="text"  name="Subject" class="display" values="${cont.getSubject()}" >
            </div><br><br>

            <div class="message-a">
            <label>Message</label><br>
                <input type="text" name="Message" value="${cont.getMessage()}" class="message">
            </div>
            <img src="images/11.jpg" class="bg">

           <form action="manageContactus" method="post">
        <input type="hidden" name="CID" value="${cont.getCID()}" >
         <input type="hidden" values="DeleteCont" name="Trigger">
        	<button class="delete">Delete</button>
        </form> 
        
       
        
        

</form>        
</div>


</c:forEach>
</body>
</html>

