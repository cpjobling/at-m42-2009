<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Cookies in JSP</title>
</head>
<body>
<%--This program has different behaviors under different browsers! --%>


<h1>Session id: <%= session.getId() %></h1>
<% Cookie[] cookies = request.getCookies();
   for(int i = 0; i < cookies.length; i++) { %>
Cookie name: <%= cookies[i].getName() %><br />
       value: <%= cookies[i].getValue() %><br />
Old max age in seconds:. <%= cookies[i].getMaxAge() %><br />
<% cookies[i].setMaxAge(5); %>
New max age in seconds: <%= cookies[i].getMaxAge() %><br />
<% } %>
<%! int count = 0; int dcount = 0; %>
<% response.addCookie(new Cookie( "Bob" + count++,
   "Dog" + dcount++)); %>
</body>
</html>
