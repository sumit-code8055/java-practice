
<%
String name = null, co = null;

String city = null, pincode = null;

String pass = null, cpass = null;

String act = request.getParameter("act");

if ("Pdata".equals(act)) {

	name = request.getParameter("name");

	co = request.getParameter("co");

	session.setAttribute("name", name);

	session.setAttribute("co", co);

	response.sendRedirect("Addresh.jsp");

	return;

}

if ("Adata".equals(act)) {

	city = request.getParameter("city");

	pincode = request.getParameter("pin");

	session.setAttribute("city", city);

	session.setAttribute("pincode", pincode);

	response.sendRedirect("Password.jsp");

	return;

}

if ("Padata".equals(act)) {

	pass = request.getParameter("pass");

	cpass = request.getParameter("cpass");

	if (pass != null && !pass.isEmpty() && pass.equals(cpass)) {

		session.setAttribute("pass", pass);

		session.setAttribute("cpass", cpass);

		response.sendRedirect("Login.jsp");

		return;

	} else {

		response.sendRedirect("Password.jsp?error=Password%20and%20Confirm%20Password%20not%20matched");

		return;
	}

}

if ("Ldata".equals(act)) {


String uname = request.getParameter("uname");

String upass = request.getParameter("upass");

String savedName = (String) session.getAttribute("name");

String savedPass = (String) session.getAttribute("pass");

if (uname != null && upass != null
        && savedName != null && savedPass != null
        && uname.equals(savedName)
        && upass.equals(savedPass)) {

    response.sendRedirect("Profile.jsp");
    return;

} else {

    response.sendRedirect("Login.jsp?error=invalid");
    return;
}


}
%>

%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Profile Details</title>
</head>
<body>
</body>
</html>
