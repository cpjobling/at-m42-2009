AT-M42 Client Server Programming for the Java Plaform
======================================================

Examples for Lecture 14: Business Tier Services (EJB)
------------------------------------------------------

This folder contains all the EJB examples from [Lecture 14](/dokuwiki/at-m42:lecture14). You must install the Java Enterprise Edition from java.sun.com and add javaee.jar to your CLASSPATH in order to compile these files. You will need a Java EE container, such as Glassfish, to deploy the application. See details at [java.sun.com/javaee](http://java.sun.com/javaee/).

### TimeHere as an Enterprise Jaba Bean

* [TimeHere.java](TimeHere.java) &ndash; remote interface to `TimeHereBean`
* [TimeHereHome.java](TimeHereHome.java) &ndash; home Interface of `TimeHereBean` (not required for EJB 3 containers).
* [TimeHereBean.java](TimeHereBean.java) &ndash; simple Stateless Session Bean that returns current system time.


----

[Home](/dokuwiki/at-m42:home) | [Lectures](/dokuwiki/at-m42:lectures) | [Lecture 14](/dokuwiki/at-m42:lecture14) | [Previous Examples](../lecture13/index.php) | [All Examples](../index.php) 
  

