<%-- 
    Document   : adminUserPage
    Created on : 16-Jan-2019, 13:21:34
    Author     : jade_
--%>

<%@page import="Class.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Admin!</h1>
        
        <%
            if(session.getAttribute("ID")== null)
            {
                response.sendRedirect("index.jsp");
            }
           
        %>
        
        <form action="Logout">
            <input type="submit" value="Logout"
        </form>
        
        <h2>Create an Account below:</h2>
        <form action="CreateAccount">
            First Name: <input type="text" name="firstName"><br>
            Surname: <input type="text" name="surname"><br>
            Address Line One: <input type="text" name="addressOne"><br>
            Address Line Two: <input type="text" name="addressTwo"><br>
            Post Code: <input type="text" name="postCode"><br>
            User Type: <select name="userType">
                <option value="0">Administrator</option>
                <option value="1">Secretary</option>
                <option value="2">Doctor</option>
            </select><br>
            ID Number: <input type="text" name="IDnum"><br>
            Password: <input type="password" name="pass"><br>
            <input type="submit" value="Create Account">
        </form>
        
        <% 
            String ID = (String)session.getAttribute("ID");
            if (ID.charAt(0)=='A') {
                    out.println("<a href=\"BlahBlah.html\">Link Here</a>");
            }
                
        %>
    </body>
</html>
