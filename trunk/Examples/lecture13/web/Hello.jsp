<%-- This JSP comment will not appear in the generated html --%>
<%-- This is a JSP directive: --%>
<%@ page import="java.util.*" %>
<%-- These are declarations: --%>
<%!  long loadTime= System.currentTimeMillis();
     Date loadDate = new Date();
     int hitCount = 0; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title></title>
  </head>
  <body>
    <%-- The next several lines are the result of a JSP expression 
        inserted in the generated html; the '=' indicates a JSP expression --%>
    <h1>
      This page was loaded at <%= loadDate %>
    </h1>
    <h1>
      Hello, world! It's <%= new Date() %>
    </h1>
    <h2>
      Here's an object: <%= new Object() %>
    </h2>
    <h2>
      This page has been up
      <%= (System.currentTimeMillis()-loadTime)/1000 %> seconds
    </h2>
    <h3>
      Page has been accessed <%= ++hitCount %> times since
      <%= loadDate %>
    </h3><%-- A "scriptlet" that writes to the server console and to the client page.
        Note that the ';' is required: --%>
				<% System.out.println("Goodbye");
           out.println("Cheerio"); %>
    <hr />
    <address>
      <a href="mailto:C.P.Joblibg@Swansea.ac.uk"></a>
    </address>
    <!-- Created: Tue Nov 30 17:22:09 GMT Standard Time 2004 -->
    <!-- hhmts start -->
    Last modified: Tue Nov 30 17:25:36 GMT Standard Time 2004 
    <!-- hhmts end -->
  </body>
</html>
