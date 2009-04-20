// Reveal what's in a the Groovlet binding
// (from Groovy in Action)

html.html {
	head {
		title 'Groovlet inspector'
	}
	body {
		h1 'Variables in the Binding'
		table(summary : 'binding') {
			tbody {
				binding.variables.each { key, value ->
					tr {
						td key.toString()
						td (value ? value.toString() : 'null')
					}
				}
			}
		}
	}
}