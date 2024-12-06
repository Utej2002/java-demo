package jdbcdemo;

import java.sql.*;

/**
* Author : Singuluri.Kumar
* Date   : 07-Nov-2024
* Time   : 12:12:12 pm
* Email  : Singuluri.Kumar@coforge.com
*/
//Demonstrate Projection
public class SelectDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		
		try {
			con=ConnectionUtil.createConnection();
			
			stmt=con.createStatement();
			
			rs=stmt.executeQuery("SELECT first_name, last_name, email from candidates order by last_name");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString("last_name")+"\t"+rs.getString("email"));
			}
			con.close();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
