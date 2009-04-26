import groovy.sql.*

def DB = 'jdbc:derby:CDs'
def USER = ''
def PASSWORD = ''
def DRIVER = 'org.apache.derby.jdbc.EmbeddedDriver'		

    // Connect to database
def sql = Sql.newInstance(DB, USER, PASSWORD, DRIVER)

def QUERY = """
SELECT albums.title, bands.band_name, albums.year
FROM bands INNER JOIN albums ON
bands.band_id = albums.artist
WHERE (((albums.category)='${args[0]}'))
"""

sql.eachRow(QUERY) { r ->
  println "Have a result!"
  println "${r.title"}  by ${r.band_name} released in ${r.year}"
}