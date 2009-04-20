<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>
      Manipulating sessions in JSP
    </title>
  </head><%--Getting and setting session object values--%>
  <body>
    <h1>
      Session id: <%= session.getId() %>
    </h1>
    <ul class="noindent">
      <li>This session was created
      at <%= session.getCreationTime() %>
      </li>
    </ul>
    <ul class="noindent">
      <li>Old MaxInactiveInterval =
			      <%= session.getMaxInactiveInterval() %>
      </li>
      <li><% session.setMaxInactiveInterval(5); %>
					New MaxInactiveInterval=
            <%= session.getMaxInactiveInterval() %>
      </li>
    </ul>
    <h2>
      If the session object "My dog" is still around,
			this value will be non-null:
    </h2>
    <ul class="noindent">
      <li>Session value for "My dog" =
					<%= session.getAttribute("My dog") %>
          <%-- Now add the session object "My dog" --%>
					<% session.setAttribute("My dog", new String("Ralph")); %>
      </li>
    </ul>
    <h1>
      My dog's name is <%= session.getAttribute("My dog") %>
    </h1>
		<%-- See if "My dog" wanders to another form --%>.
    <form type="POST" action="SessionObject2.jsp">
      <input type="submit" name="submit" value="Invalidate" />
    </form>
    <form type="POST" action="SessionObject3.jsp">
      <input type="submit" name="submit" value="Keep Around" />
    </form>
  </body>
</html>
