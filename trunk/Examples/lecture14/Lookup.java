package uk.ac.swan.atm42.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lookup {

	static final String DB = "jdbc:derby:CDs";
	static final String USER = "";
	static final String PASSWORD = "";
	static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
		
	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {

		// Load the driver (registers itself)
		Class.forName(DRIVER);
		System.out.println("Connection made");
		Connection c = DriverManager.getConnection(DB, USER, PASSWORD);
		System.out.println("Connection: " + c);
		Statement s = c.createStatement();
		System.out.println("Statement: " + s);
		// SQL query
		String QUERY = "SELECT albums.title, bands.band_name, albums.year\n"
						+ "  FROM bands INNER JOIN albums ON \n"
						+ "     bands.band_id = albums.artist \n"
						+ "  WHERE (((albums.category)='" + args[0] + "'))"
		// SQL code:
		ResultSet r = s.executeQuery(QUERY);
		System.out.println("ResultSet: " + r);
		while (r.next()) {
			// Capitalization doesn't matter:
			System.out.println("Have a result!");
			System.out.println(r.getString("Title") + " by "
					+ r.getString("bAND_NAME") + " released in "
					+ r.getString("YEAR") + ".");
		}
		s.close(); // Also closes ResultSet
	}

}