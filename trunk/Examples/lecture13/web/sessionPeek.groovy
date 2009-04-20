//Using the HttpSession class.

import groovy.xml.MarkupBuilder

if (session == null) {
  	session = request.getSession(true)
}
		
html.html() {
    head () {
        title('Session Peek')
    }
    body () {
        h1 ('Session Peek')

        def ival = session?getAttribute('sesspeek.cntr') 
        if (ival == null) {
            ival = 1
        }
        else {
            ival = ival + 1
        }
        session.setAttribute("sesspeek.cntr", ival)
        p () {
            println "you have hit this page <b>${ival}</b> times."
        }
        h2 ('Saved Session Data')
        // Loop through all data in the session:
        session.getAttributeNames().each { name -> 
            println "${name} = ${session.getAttribute(name)}<br />"
        }
        h3 ('Session Statistics')
                println """
Session ID: ${session.getId()}<br>
New Session: ${session.isNew()}<br>
Creation Time: ${session.getCreationTime()}
<i>(${new Date(session.getCreationTime())})</i><br />
    Last Accessed Time: ${session.getLastAccessedTime()}
<i>(${new Date(session.getLastAccessedTime())})</i><br />
Session Inactive Interval: ${session.getMaxInactiveInterval()}
Session ID in Request: ${req.getRequestedSessionId()}<br />
Is session id from Cookie: ${request.isRequestedSessionIdFromCookie()}<br />
Is session id from URL: ${request.isRequestedSessionIdFromURL()}<br />
Is session id valid: ${req.isRequestedSessionIdValid()}<br />
"""
    }
}

def getServletInfo() {
    return "A session tracking servlet"
}