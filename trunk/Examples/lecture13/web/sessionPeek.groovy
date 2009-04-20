//Using the HttpSession class.

import groovy.xml.MarkupBuilder

def session = request.session
		
html.html {
    head {
        title 'Session Peek'
    }
    body {
        h1 'Session Peek'

        def ival = session?.counter
        if (ival == null) {
            ival = 1
        }
        else {
            ival = ival + 1
        }
        session.counter = ival
        p  "you have hit this page ${ival} times."
        h2  'Saved Session Data'
        // Loop through all data in the session:
        session.getAttributeNames().each { name -> 
            println "${name} = ${session.getAttribute(name)}<br />"
        }
        h2 'Session Statistics'
                println """
Session ID: ${session.getId()}<br>
New Session: ${session.isNew()}<br>
Creation Time: ${session.getCreationTime()}
<i>(${new Date(session.getCreationTime())})</i><br />
    Last Accessed Time: ${session.getLastAccessedTime()}
<i>(${new Date(session.getLastAccessedTime())})</i><br />
Session Inactive Interval: ${session.getMaxInactiveInterval()}
Session ID in Request: ${request.getRequestedSessionId()}<br />
Is session id from Cookie: ${request.isRequestedSessionIdFromCookie()}<br />
Is session id from URL: ${request.isRequestedSessionIdFromURL()}<br />
Is session id valid: ${request.isRequestedSessionIdValid()}<br />
"""
    }
}

def getServletInfo() {
    return "A session tracking servlet"
}