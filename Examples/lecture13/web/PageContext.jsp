<%--Viewing the attributes in the pageContext--%>
<%-- Note that you can include any amount of code
inside the scriptlet tags --%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>Viewing the attributes in the JSP pageContext</title>
  </head>
  <body>
    Servlet Name: <%= config.getServletName() %><br />
    Servlet container supports servlet version:
    <% out.print(application.getMajorVersion() + "."
    + application.getMinorVersion()); %><br />
    <%
      session.setAttribute("My dog", "Ralph");
      for(int scope = 1; scope <= 4; scope++) {  %>
    <h3>
      Scope: <%= scope %>
    </h3><%  Enumeration e =
          pageContext.getAttributeNamesInScope(scope);
        while(e.hasMoreElements()) {
          out.println("\t<li>" + 
            e.nextElement() + "</li>");
        }
      }
    %>
  </body>
</html>
