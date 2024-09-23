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
                    width:35%;
                    height: 450px;
                    background-color: rgba(0, 0, 0, 0.5);
                    position:absolute;
                    top:300px;
                    left:400px;
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
                top:80px;
                left:60px;
                font-size: 20px;
                color: white;

            }
            .box-1{
                width: 300px;
                height: 35px;
            }
            .submit-1{
                position: absolute;
                top:280px;
                left:0px;
                background-color: rgba(0, 0, 0, 0.5);
                color: white;
                width: 300px;
                height: 40px;
                cursor: pointer;
                font-size: 20px;
                border-radius: 50px;
            }
            .expiry{
                width: 80px;
                height: 35px;
            }
        </style>
    </head>
    <body>
        
        <img src="images/4.jpg" class="bg">
        <center><i><h1 class="h1_main">~ Care</i>One ~</h1></center>
     
        <div class="userbox">
            <font>
            <h2 class="h2text">~ <u>Payment </u> ~</h2>
            </font>
            <div>
                <form class="form-1">
                    <lable>Type : </lable> <select id="expiry" name="Expiry" class="expiry" >
                        <option value="01">LKR</option>
                        <option value="02">USD</option>
                        
                      </select><br><br>
                    <lable>Amount : </lable><br><input type="text" name="amount"  placeholder="Amount" class="box-1"> <br>
                    <label>Card Number : </label> <br><input type="text" name="card"  placeholder="Debit / Credit Card Number" class="box-1" maxlength="16"> <br><br>
                    <label>Expiry Date: </label><select id="expiry" name="Expiry" class="expiry" >
                        <option value="01">Expiry</option>
                        <option value="02">2023/10</option>
                        <option value="03">2023/11</option>
                        <option value="03">2023/12</option>
                        <option value="03">2024/01</option>
                        <option value="03">2024/02</option>
                        <option value="03">2024/03</option>
                       
                      </select>
                    
                      
                      <label> CVV : </label><input type="password" id="cvv" name="cvv" maxlength="3" placeholder="***" class="expiry" required><br>
                   
                    

                    <a href="PaymentSuccess.jsp">
                    <input type="submit" name="pay" value="Pay Amount" class="submit-1" >
                    </a>
                </form>
            

            
            </div>
        </div>
       

    </body>
</html>