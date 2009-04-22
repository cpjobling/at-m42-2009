// HighLow game from Groovy in Action

def session = request.session
def guess = params.guess

guess = guess ? guess.toInteger() : null
if (params.restart) guess = null

if (! session.goal || params.restart) {
    session.goal = (Math.random() * 100).toInteger()
}
def goal = session.goal

html.html { head { title 'Think of a Number' }
    body {
        h1 'Think of a Number'
        if (goal && guess) {
            div "Your guess $guess is "
            if (guess == goal) {
                div 'correct!'
            } else if (guess < goal) {
            	div 'too low' 
            } else {
                div 'too high'
            }
        }
        p "What's your guess (0..100)?"
        form(action : 'HighLow.groovy') {
            input (type : 'text', name : 'guess', '')
            button (type : 'submit', 'Guess')
            button (type : 'submit', name : 'restart', value : 'true', 'New Game')
        }
    }
}