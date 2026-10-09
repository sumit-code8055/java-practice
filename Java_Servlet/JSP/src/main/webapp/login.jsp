
<%
    String username = request.getParameter("uname");
    String password = request.getParameter("upass");

    if (username.equals(password)) {
        response.sendRedirect("profile.jsp");
    } else {
        response.sendRedirect("index.jsp?emsg=Something%20went%20Wrong");
    }
%>
