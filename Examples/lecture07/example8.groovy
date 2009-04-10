// Test game

  // create game
def atM42 = new Game(name : 'Client Server Programming on the Java Platform')

 // add items
atM42.createItem('labwork', 20, 'Exercises in programming')
atM42.createItem('seminar', 30, 'Latest research in enterprise computing')
atM42.createItem('project', 50)
def project = atM42.findItem('project')
project.description = """
A development project involving the creation of a simple
adventure game in Grails"""

  // adjust "grades" for items
atM42.increaseValueOfItem('labwork', 10) // now 30
atM42.decreaseValueOfItem('project', 10) // now 40
atM42.decreaseValueOfItem('project', 50) // remains at 40

  // display details of the project item
println "Value of project is: ${atM42.getValueOfItem('project')}"
println "Project description: ${project}"
println "${project.description}"

  // calculate total value of items
println "Total value of items: ${atM42.getTotalValueOfItems()}"