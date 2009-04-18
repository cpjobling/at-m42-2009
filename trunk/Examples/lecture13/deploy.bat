REM - Deploy Web Apps
REM - You will need to check values for TOMCAT_HOME and GROOVY_HOME before running this script

set TOMCAT_HOME="D:\java\servers\Apache Tomcat 6.0.18"
set GROOVY_HOME=D:\java\languages\Groovy-1.6.0

REM compile servlets
javac web\HelloServlet.java -cp %TOMCAT_HOME%\lib\servlet-api.jar -d web\WEB-INF\classes


mkdir %TOMCAT_HOME%\weapps\at-m42-examples
robocopy /e web  %TOMCAT_HOME%\webapps\at-m42-examples

copy %GROOVY_HOME%\embeddable\groovy-all-1.6.0.jar %TOMCAT_HOME%\webapps\at-m42-examples\WEB-INF\lib

