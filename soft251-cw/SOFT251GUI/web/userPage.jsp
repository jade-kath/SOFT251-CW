<%-- 
    Document   : Patients
    Created on : 14-Jan-2019, 19:03:57
    Author     : jade_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
body{
  margin: 0;
}

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  width: 25%;
  background-color: #f1f1f1;
  position: fixed;
  height: 100%;
  overflow: auto;
}

li a {
  display: block;
  color: #000;
  padding: 8px 16px;
  text-decoration: none;
}

li a.active {
  background-color: #4CAF50;
  color: white;
}

li a:hover:not(.active) {
  background-color: #555;
  color: white;
}
.logout {
    float: right;
    margin-right: 60px;    
}
    </style>
    <body>
        <%
            if(session.getAttribute("ID")== null)
            {
                response.sendRedirect("index.jsp");
            }
            
            String ID = (String)session.getAttribute("ID");
            
        %>
        <ul>
            <li>
                <% if(ID.charAt(0)== 'S')
                out.print("<a href=\"#\">Patient Details</a>");
                %>
            </li>
            <li><a href="#">Appointments</a></li>
            <li><a href="#">Doctors</a></li>
            <li>
               <% if(ID.charAt(0)== 'S')
                   out.print("<a href=\"#\">Stock</a>");
               %>
            </li>
        </ul>
        <h1>See Patients Here</h1>
        <div>
           
        </div>
        <div class="logout">
        <form action="Logout">
            <input type="submit" value="Logout"
        </form>
        </div>
    </body>
</html>
