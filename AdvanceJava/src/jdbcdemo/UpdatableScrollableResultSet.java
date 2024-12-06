package jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
* Author :Voggu.Reddy
*Date :08-Nov-2024
*Time :9:49:33 am
*Email :Voggu.Reddy@coforge.com
*/

public class UpdatableScrollableResultSet {

	public static void main(String[] args) {
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			// Step 1: Establish a connection
			connection = ConnectionUtil.createConnection();

			// Step 2: Create a Statement with scrollable and updatable ResultSet
			statement = connection.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE, 
					ResultSet.CONCUR_UPDATABLE);

			// Step 3: Execute a query to get data from the Candidate table
			resultSet = statement.executeQuery("SELECT * FROM Candidates");

			// Step 4: Move to the first row
			if (resultSet.absolute(50)) {
				System.out.println("First Record: " + resultSet.getInt("id") + ", " + resultSet.getString("last_name"));

				// Update the first candidate's name
				resultSet.updateString("last_name", "honey ");
				resultSet.updateRow(); //Update Table
				System.out.println("First record updated successfully.");
			}

			// Step 5: Move to the last row
			if (resultSet.absolute(30)) {
				System.out.println("Last Record: " + resultSet.getInt("id") + ", " + resultSet.getString("last_name"));

				// Update the last candidate's name
				resultSet.updateString("last_name", "koppula");
				resultSet.updateRow();
				System.out.println("Last record updated successfully.");
			}

			// Step 6: Move to a specific row, e.g., second row
			if (resultSet.absolute(40)) {
				System.out.println("Second Record: " + resultSet.getInt("id") + ", " + resultSet.getString("last_name"));

				// Update the second candidate's name
				resultSet.updateString("last_name", "prasanna");
				resultSet.updateRow();
				System.out.println("Second record updated successfully.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) resultSet.close();
				if (statement != null) statement.close();
				if (connection != null) connection.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}


	}

}
