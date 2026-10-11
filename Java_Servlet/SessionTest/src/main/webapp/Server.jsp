
<%
String name = null, co = null;
String city = null, pincode = null;

String act = request.getParameter("act");

if ("pdata".equals(act)) {

    name = request.getParameter("name");
    co = request.getParameter("co");

    session.setAttribute("name", name);
    session.setAttribute("co", co);

    response.sendRedirect("Address.jsp");
    return;
}

if ("adata".equals(act)) {

    city = request.getParameter("city");
    pincode = request.getParameter("pin");

    out.print("Name : " + (String) session.getAttribute("name") + "<br>");
    out.print("C/O : " + (String) session.getAttribute("co") + "<br>");
    out.print("City : " + city + "<br>");
    out.print("Pincode : " + pincode + "<br>");
}
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Profile Details</title>
</head>
<body></body>
</html>
