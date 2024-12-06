package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
* Author : Singuluri.Kumar
* Date   : 07-Nov-2024
* Time   : 12:08:20 pm
* Email  : Singuluri.Kumar@coforge.com
*/
//Utility class to connect mySql server
public class ConnectionUtil {

	public static Connection createConnection() throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","cfg@1234");
		return con;
	}
}
