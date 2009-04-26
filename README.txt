AT-M42 Client Server Programming for the Java Platform
======================================================


Quick links
-----------

* [Course home](/dokuwki/at-m42:home)
* [Lectures](/dokuwiki/at-m42:lectures)
* [Examples](Examples)
* [Case Studies](/dokuwiki/at-m42:casestudies)
* [Case Studies (source code)](Case-Studies)
* [Lab Work](/dokuwiki/at-m42:labs)

Using the source code
----------------------

All the source code packaged as a Zip file (Windows Compressed Folder) can be downloaded from [at-m42-source.zip](at-m42-source.zip).

The [Examples](Examples) and [Case-Studies](Case-Studies) folders contains source code for the examples presented in lectures and in the case-studies. To use these you will need access to the Java Standard Edition Development Kit (JDK) and Groovy. To run the examples for Lecture 13 you will need a suitable Web Container (I used and tested the code with Apache Tomcat). To run the examples in Lecture 14 you will need a suitable database engine. I used Apache Derby. For the fifth case study, and the project work, you will need to install and configure Grails. Links to the project sites for these tools is in the resources folder of the Blackboard course site.

The windows "batch file" [atm42-init.bat](atm42-init.bat) will set the environment variables that you need to run the examples. You will need to edit this file before use in order to properly set the environment variables `JAVA_HOME`, `GROOVY_HOME`, `GRAILS_HOME`, `DERBY_HOME` and 'AT-M42`. The Java classpath required by java and Groovy and the windows path required to execute the associated tools from the windows command line will be properly configured by executing this file. If you want to make the changes permanent, e.g. on your own machine, you will need to add these environment variables to your windows configuration. See [Lab Setup](/dokuwki/at-m42:labs:setup) for details on how to do this. 
