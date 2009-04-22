// HighLow game from Groovy in Action: using GSP for view

def dispatch(page, req, resp) {
	def dispatcher = request.getRequestDispatcher(page)
	dispatcher.forward(request, response)
}

def session = request.session
def guess = params.guess

guess = guess ? guess.toInteger() : null
if (params.restart) guess = null

if (! session.goal || params.restart) {
    session.goal = (Math.random() * 100).toInteger()
}

request.setAttribute('guess', guess)
dispatch("HighLow.gsp", request, response)

