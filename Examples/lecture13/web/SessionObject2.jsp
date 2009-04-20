<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>
      SessionObject2.jsp
    </title>
  </head>
  <body>
    <%--SessionObject2.jsp--%>
    <h1>
      Session id:.<%= session.getId() %>
    </h1>
    <h1>
      Session value for "My dog" <%= session.getValue("My dog") %>
    </h1>
		<% session.invalidate(); %>
  </body>
</html>
