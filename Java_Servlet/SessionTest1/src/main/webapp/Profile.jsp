<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%
String name = (String) session.getAttribute("name");
String co = (String) session.getAttribute("co");
String city = (String) session.getAttribute("city");
String pincode = (String) session.getAttribute("pincode");

if (name == null) {
response.sendRedirect("Login.jsp");
return;
}
%>

<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>My Profile</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
    }

    .profile {
        width: 350px;
        margin: 80px auto;
        padding: 25px;
        background-color: white;
        border-radius: 10px;
        box-shadow: 0 0 10px gray;
    }

    h2 {
        text-align: center;
        color: green;
    }

    p {
        font-size: 16px;
        margin: 15px 0;
    }
</style>

</head>

<body>

<div class="profile">

<h2>My Profile</h2>

<p><b>Name:</b> <%= name %></p>

<p><b>Company:</b> <%= co != null ? co : "" %></p>

<p><b>City:</b> <%= city != null ? city : "" %></p>

<p><b>Pincode:</b> <%= pincode != null ? pincode : "" %></p>

</div>

</body>
</html>
