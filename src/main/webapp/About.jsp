 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
    <head>
        <!-- title for the website -->
        <title>
            CareOne
        </title>
        <style>
            body{
    background-color: #EDF5E1;
  }
  
  #{
    box-sizing: border-box;
    margin: 0;
    padding: 0;
  }
  
  li, a, button{
    font-family: "	Copperplate",fantasy;
    font-weight: 100;
    font-size: 20px;
    color: black;
    text-decoration: none;
  }
  
  header{
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 3px 10%;
  }
  
  .logo{
    width: 110px;
    height: 110px; 
    transform: translateY(0px);
    opacity: 1;
  }
  
  .nav_links{
    list-style: none;

  }
  
  .nav_links li{
    display: inline-block;
    padding: 1px 2px;
    
  }
  
  .nav_links li a{
    transition: all 0.3s ease 0s;
  }
  
  .nav_links li a:hover{
    color: rgb(239, 68, 102);
  }
  
  button{
    background-color: pink;
    border: none;
    border-radius: 50px;
    transition: all 0.3s ease 0s;
    
  }
  
  button:hover:not(.active1){
    background-color: white;
    
  }
  
  .active1{
    border-radius:50px;
    padding: 2px;
    
    }
  
  .container {
    position: relative;
  }
  
  
  
  .r{
    margin-top: 10px; /* Adjust the top margin */
    margin-right: 400px; /* Adjust the right margin */
    margin-bottom: 30px; /* Adjust the bottom margin */
    margin-left: 1px; /* Adjust the left margin */
    transform: translateY(30px);  
  }
  .s{
    transform: translateX(250px); 
  }
  
  .q{
    position: relative;
    left: 800px;
    transform: translateY(-30px);
    
  }
  .font-sizetop{
    box-sizing: border-box;
    margin: 0;
    padding: 0;
    font-size: 10px;
  }

  .ol{
    background-color: #dab7b1;
  }
  
  .image-container {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh; 
  }
  
  .image-container img {
    width: 100%;
    max-height: 100%;
    opacity: 0.5;
  }
  
  .forimage{
    transform: translateY(4px);
  } 

.contactus{
  width:10%;
  height: 80%;
  border-radius: 1px;
  background-color :#dab7b1;
}
  
.image-container {
  position: relative;
  width: 100px;
}



.icon{
  position: absolute;
  top:10px;
  right:80px;
}
 

.slider
{
   overflow: hidden; 

}

 
.slider figure
{
    position: relative;
    width:500%;
    margin:2;
    left:0; 
    animation: 30s slider infinite;
    opacity: 0.6;
}
.slider figure img
{
    float: left;
    width: 20%;

}

@keyframes  slider 
{
     0%{
        left: 0%;
     }
     20%{
        left: 0%;
     }
     25%{
        left: -100%;
     }
     45%{
        left: -100%;
     }
     50%{
      left: -200%;
   }
   70%{
      left: -200%;
   }
   75%{
      left: -300%;
   }
   95%{
      left: -300%;
   }
   100%{
      left: -400%;
   }
    

}
.image-1{
  height: 800px;
}

.about-the-place{
  position: absolute;
  top:10px;
  left:80px;
  background-color:rgba(0,0,0,0.6);
  color:white;
  width:1100px;
  height:750px;
  border-radius: 5px;
  font-size: 16px;
  font-size: 20px;
}

.right-side-image{
  position: absolute;
  top:160px;
  right:70px;
  background-color: #dab7b1;
  width:38%;
  height:300px;
  border-radius: 10px;
}
.right-side-image-i{
  position: absolute;
  top:20px;
  left:50px;
  width:80%;
  height: 250px;
  opacity: 0.9;
}

.right-side-text{
  position: absolute;
  top:550px;
  right:70px;
  background-color: #dab7b1;
  width:38%;
  height:355px;
  border-radius: 10px;
}
.text-text{
    position: absolute;
    left:10px;
}
        </style> <!-- css referenced link --> 
       
    </head>
    <script src="script.js"></script> <!-- java script referenced link-->
    <body> <!-- main -->
    
            
            <div class="about-the-place">
                <br><br>
                <center><u>Welcome to the Online e-Channelling System!</u></center><br><br>
                <div class="text-text">"CareOne" is an outstanding online platform dedicated to simplifying your e-channelling experience and offering top-quality services. Our user-friendly portal 
empowers you to effortlessly schedule online telehealth consultations and address 
various medical needs for patients, all from the comfort of your own device. We 
comprehend the urgency that often accompanies healthcare requirements, and our 
virtual services are designed to cater to these pressing needs efficiently. 
<br><br>
Patients and users will find our website easily reachable, allowing remote access 
without any difficulty. Registration is a straightforward process, granting users active 
participation on our online platform, complete with the services and solutions they 
require. For those who haven't yet registered, basic entry to the homepage, gallery, 
and about us pages are available, while the more extensive features are exclusively 
accessible to our registered users.
<br><br>
At "CareOne", we are committed to transforming the way you engage with healthcare 
services, ensuring that your medical needs are met promptly and conveniently. Our 
platform doesn't stop at healthcare alone; it provides all kinds of needs for users and 
seamlessly connects with other platforms to access their basic requirements. 
Whether it's medical consultations, daily essentials, or connecting with various other 
services, "CareOne" is your one-stop destination.
<br><br>
What sets us apart is our unwavering dedication to excellence. Our services are 
genuine, providing you with excellent care. Our customer care team is available 
within the system in a friendly and patient manner, always ready to listen to your 
needs. Additionally, our health inspector would inspect every aspect of our platform, 
ensuring that all works are done to the highest standards. Furthermore, our 
dedicated admin ensures a secure environment and maintains the confidentiality of 
customer details. The admin also facilitates seamless communication and access to 
other systems to aid whenever needed.
<br><br>
To further enhance our commitment to transparency and continuous improvement, 
our health inspector provides an annual report detailing every single aspect of our 
operations. This report serves as a valuable resource, guiding us in providing even 
better services and supporting various activities through our system. Join us today to 
experience the future of e-channelling and unlock a world of healthcare accessibility 
and beyond, all at your fingertips
</div>
        </body>
</html>