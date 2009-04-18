def fields = request.getParameterNames()


html.html() {
	head() {
		title('Echo form example')
	}	
	body () {
		if (! fields.hasMoreElements()) { 
			// No form submitted -- create one:
			h1 ('The form')
			form(method : 'POST', action : '/at-m42-examples/echoForm.groovy') {
				for (i in 0..<10) {
					b ("Field${i}")
					input(type : 'text', size : '20', name : "Field${i}", value : "Value${i}")
					br ()
				}
				input(type : 'submit', name : 'submit', value : 'Submit')
			}
		}
		else {
			// Response contains data so show that instead
			h1('The results')
			fields.each {field ->
				print "${field} = ${request.getParameter(field)}"
				br ()
			}
		}		
	}
}