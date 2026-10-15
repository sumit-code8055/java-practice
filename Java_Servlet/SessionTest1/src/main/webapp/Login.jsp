
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>

    <h2>Login Page</h2>

    <form action="Server.jsp" method="post">

        <label>Username:</label>
        <input type="text" name="uname" required>
        <br><br>

        <label>Password:</label>
        <input type="text" name="upass" required>
        <br><br>

        <button type="submit">Login</button><br><br>
        
        
        <input type="hidden" name="act" value="Ldata"><br><br>
        

    </form>

</body>
</html>
