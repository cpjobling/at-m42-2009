<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>
      SessionObject3.jsp
    </title>
  </head>
  <body>
    <%--SessionObject3.jsp --%>
    <h1>
      Session id:.<%= session.getId() %>
    </h1>
    <h1>
      Session value for "My dog" <%= session.getValue("My dog") %>
    </h1>
    <form type="POST" action="SessionObject.jsp">
      <input type="submit" name="submit" value="Return" />.
    </form>
  </body>
</html>
