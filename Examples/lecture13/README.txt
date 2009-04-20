AT-M42 Client Server Programming for the Java Plaform
======================================================

Examples for Lecture 13: Presentation Services
---------------------------------------------------

This folder contains all the examples from [Lecture 13](/dokuwiki/at-m42:lecture13). The examples are Groovelets and GSP pages. To deploy these, copy the folder `web` to your server's `webapps` folder and rename it `at-m42-examples`. Restart the server and the examples should be at http://localhost:8080/at-m42-examples. You will also need to put $GROOVY_HOME\embeddable\groovy-all.1.6.0.jar file into 'WEB-INF/lib'

* [deploy.bat](deploy.bat) &ndash; batch-file to install web-app into Tomcat. Edit to suit your local settings.
* [helloServlet.java](helloServlet.java) &ndash; hello world Servlet. Run: http://localhost:8080/at-m42-examples/helloServlet.
* [helloGroovlet.groovy](helloGroovlet.groovy) &ndash; hello world Groovlet. Run: http://localhost:8080/at-m42-examples/helloGroovlet.groovy.
* [implicitVariables.groovy](implicitVariables.groovy) &ndash; implicit variables.
* [implicitVariables2.groovy](implicitVariables2.groovy) &ndash; using a builder to avoid long print statements.
* [inspect.groovy](inspect.groovy) &ndash; Groovlet that reveals what's in the Groovlet binding.
* [echoForm.groovy]() &ndash; dumps the name-value pairs of an HTML form. Run: http://localhost:8080/at-m42-examples/echoForm.groovy.

[TimeHereI.java](TimeHereI.java) &ndash; the `TimeHere` remote interface.
* [TimeHere.java](TimeHere.java) &ndash; the implementation of the `TimeHere` remote object.
* [displayTimeHere.groovy](displayTimeHere.groovy) &ndash; uses remote object `TimeHere`.
* [startTimeHere.groovy](startTimeHere.groovy) &ndash; register remote object `TimeHere`.

----

[Home](/dokuwiki/at-m42:home) | [Lectures](/dokuwiki/at-m42:lectures) | [Lecture 13](/dokuwiki/at-m42:lecture11) | [Previous Examples](../lecture11/index.php) | [All Examples](../index.php) | [Next Examples](../lecture14/index.php)
  

