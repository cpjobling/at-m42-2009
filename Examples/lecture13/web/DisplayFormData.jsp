<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%-- Fetching the data from an HTML form. --%>
<%-- This JSP also generates the form. --%>
<%@ page import="java.util.*" %>
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>
      Display Form Data
    </title>
  </head>
  <body>
    <h1>
      DisplayFormData
    </h1>
    <h3>
      <% Enumeration flds = request.getParameterNames();
         if(!flds.hasMoreElements()) { // No fields %>
    </h3>
    <form method="post" action="DisplayFormData.jsp">
      <%  for(int i = 0; i < 10; i++) { %>
			         Field<%= i %>: <input type="text" size="20" name="field<%= i %>"
               value="Value<%= i %>" /><br />
      <% } %> 
			<input type="submit" name="submit" value="Submit" />
    </form>
		<% } else { %>
    <ul>
         <%  while(flds.hasMoreElements()) {
             String field = (String)flds.nextElement();
             String value = request.getParameter(field); %>
         <li><%= field %> = <%= value %></li>
	  <%   } 
       } %>
    </ul>
    <hr />
    <address>
      <a href="mailto:C.P.Jobling@Swansea.ac.uk"></a>
    </address>
    <!-- Created: Tue Nov 30 17:22:09 GMT Standard Time 2004 -->
    <!-- hhmts start -->
    Last modified: Tue Nov 30 17:25:36 GMT Standard Time 2004 
    <!-- hhmts end -->
  </body>
</html>
