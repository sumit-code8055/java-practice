
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>

<body>

<%
    String emsg = request.getParameter("emsg");

    if (emsg != null) {
        out.print("<div style='color:red; text-align:center;'>"
                + emsg +
                "</div>");
    }
%>

<form action="login.jsp" method="post">

    Username :
    <input type="text" name="uname">

    <br><br>

    Password :
    <input type="password" name="upass">

    <br><br>

    <input type="submit" value="Login">

</form>

</body>
</html>
