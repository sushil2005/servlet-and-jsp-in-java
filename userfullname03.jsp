<html>
<body>
<%
    String firstname = request.getParameter("firstname");
    String lastname = request.getParameter("lastname");
    String fullname = firstname + " " + lastname;
%>
<center>
    <h2>Your Full Name: <%= fullname %></h2>
</center>
</body>
</html>
