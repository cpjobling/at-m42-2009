AT-M42 Client Server Programming for the Java Plaform
======================================================

Examples for Lecture 13: Presentation Services
---------------------------------------------------

This folder contains all the examples from [Lecture 13](/dokuwiki/at-m42:lecture13). The examples are Groovelets and GSP pages. To deploy these, copy the folder `web` to your server's `webapps` folder and rename it `at-m42-examples`. Restart the server and the examples should be at http://localhost:8080/at-m42-examples. You will also need to put $GROOVY_HOME\embeddable\groovy-all.1.6.0.jar file into 'WEB-INF/lib'

### Servlets and Groovlets

* [deploy.bat](web/deploy.bat) &ndash; batch-file to install web-app into Tomcat. Edit to suit your local settings.
* [helloServlet.java](web/helloServlet.java) &ndash; hello world Servlet. Run: http://localhost:8080/at-m42-examples/helloServlet.
* [helloGroovlet.groovy](web/helloGroovlet.groovy) &ndash; hello world Groovlet. Run: http://localhost:8080/at-m42-examples/helloGroovlet.groovy.
* [implicitVariables.groovy](web/implicitVariables.groovy) &ndash; implicit variables. Run: http://localhost:8080/at-m42-examples/implicitVariables.groovy.
* [implicitVariables2.groovy](web/implicitVariables2.groovy) &ndash; using a builder to avoid long print statements. Run: http://localhost:8080/at-m42-examples/implicitVariables2.groovy.
* [inspect.groovy](web/inspect.groovy) &ndash; Groovlet that reveals what's in the Groovlet binding. Run: http://localhost:8080/at-m42-examples/inspect.groovy.
* [echoForm.groovy](web/echoForm.groovy) &ndash; dumps the name-value pairs of an HTML form. Run: http://localhost:8080/at-m42-examples/echoForm.groovy.
* [sessionPeek.groovy](web/sessionPeek.groovy) &ndash; Using the `HttpSession` class. Run: http://localhost:8080/at-m42-examples/sessionPeek.groovy.

### Java Server Pages (JSP)

* [ShowSeconds.jsp](web/ShowSeconds.jsp) &ndash; a simple JSP example. Run: http://localhost:8080/at-m42-examples/ShowSeconds.jsp.
* [Hello.jsp](web/Hello.jsp) &ndash. hello world JSP. Run http://localhost:8080/at-m42-examples/Hello.jsp.
* [DisplayFormData.jsp](web/DisplayFormData.jsp) &ndash; Fetching the data from an HTML form. Run http://localhost:8080/at-m42-examples/DisplayFormData.jsp.
* [Scope.jsp](web/Scope.jsp) &ndash; JSP attributes and page scope. Run http://localhost:8080/at-m42-examples/Scope.jsp.
* [SessionObject.jsp](web/SessionObject.jsp) &ndash; Manipulating sessions in JSP. Run http://localhost:8080/at-m42-examples/SessionObject.jsp.
* [Cookies.jsp](web/Cookies.jsp) &ndash; Creating and Modifying Cookies. Run http://localhost:8080/at-m42-examples/Cookies.jsp.


### Groovy Server Pages (GSP)

* [HighLow.groovy](web/HighLow.groovy) &ndash; HighLow game. Run http://localhost:8080/at-m42-examples/HighLow.groovy.
* [HighLow2.groovy](web/HighLow2.groovy) &ndash; HighLow game: controller dispatches to view template. Run http://localhost:8080/at-m42-examples/HighLow2.groovy.
* [HighLow.gsp](web/[HighLow.gsp]) &ndash; HighLow game: view template (GSP). 

----

[Home](/dokuwiki/at-m42:home) | [Lectures](/dokuwiki/at-m42:lectures) | [Lecture 13](/dokuwiki/at-m42:lecture13) | [Previous Examples](../lecture12/index.php) | [All Examples](../index.php) | [Next Examples](../lecture14/index.php)
  

