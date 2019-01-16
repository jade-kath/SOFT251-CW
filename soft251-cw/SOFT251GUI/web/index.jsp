<%-- 
    Document   : index
    Created on : 15-Jan-2019, 14:51:33
    Author     : jade_
--%>

<%@page import="Class.Accounts"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome</h1>
        <form action ="Login">
            ID Number: <input type="text" name="IDNumber"><br>
            Password: <input type="password" name="pword"><br>
            <input type="submit" value="Login">
        </form>
        
        <br>
        
        <h2>Request an Account below:</h2>
        <form action="CreatePatient">
            First Name: <input type="text" name="firstName"><br>
            Surname: <input type="text" name="surname"><br>
            Address Line One: <input type="text" name="addressOne"><br>
            Address Line Two: <input type="text" name="addressTwo"><br>
            Post Code: <input type="text" name="postCode"><br>
            ID Number: <input type="text" name="IDnum"><br>
            Password: <input type="password" name="pass"><br>
            <input type="submit" value="Create Account">
        </form>
    </body>
</html>
