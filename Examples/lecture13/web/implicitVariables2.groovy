import groovy.xml.MarkupBuilder

html.html() {
    head() {
        title("Hello system groovlet")
    }
    body () {
        h1("Hello system groovlet")
        
        table(border : "1") {
            tr() {
            	td("Servlet container")
            	td("${application.getServerInfo()}")
            }
            tr() {
            	td("Lecturer init parameter")
            	td("${application.getInitParameter('lecturer')}")
            }
            tr() {
            	td("Module init parameter")
            	td("${application.getInitParameter('module')}")
            }
        }
    }
}