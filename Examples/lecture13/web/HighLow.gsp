<htm>
  <head>
     <title>Think of a Number</title>
  </head>
  <body>
    <h1>Think of a Number</h1>
    <% def guess = request.guess %>
    <% def goal = session.goal %>
    Your guess $guess is <%
        if (guess == goal) {
            out << 'correct!'
        } else if (guess < goal) {
        	out << 'too low' 
        } else {
            out << 'too high'
        }
    %>
    <p>What's your guess (0..100)?</p>
    <form action='HighLow2.groovy'
        <input type='text' name='guess' />
        <button type='submit'>Guess</button>
        <button type='submit' name='restart' value='true'>New Game</button>
    </form>
  </body>
</html>