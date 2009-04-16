REM Build RMI example

javac *.java -d . 

rmic -classpath . -d . uk.ac.swan.atm42.rmi.TimeHere

