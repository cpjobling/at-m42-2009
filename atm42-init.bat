REM - Setting up environment AT-M42 Client Server Programming for the Java Plaform
REM - for Groovy/Grails on Windows

@ECHO OFF
REM Edit the following lines to match your set up
SET JAVA_HOME=d:\java\jdk1.6.0_10
SET GROOVY_HOME=d:\java\languages\Groovy-1.6.0
SET GRAILS_HOME=d:\java\applications\grails-1.0
SET AT-M42=e:\dev\at-m42-2009

REM Add JAVA_HOME\bin;GROOBY_HOME\bin;GRAILS_HOME\bin; to PATH
set PATH=%JAVA_HOME%\bin;%GROOVY_HOME%\bin;%GRAILS_HOME%\bin;%PATH%
set CLASSPATH=.;%AT-M42%\src\lib;%CLASSPATH%S

cd %AT-M42%\Examples


ECHO Try groovyConsole lecture02\example1.groovy