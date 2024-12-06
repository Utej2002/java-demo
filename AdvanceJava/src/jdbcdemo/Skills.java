package jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 * Author : Singuluri.Kumar
 * Date   : 07-Nov-2024
 * Time   : 4:44:12 pm
 * Email  : Singuluri.Kumar@coforge.com
 */

public class Skills {

	Connection con;
	CallableStatement cstmt;
	ResultSet rs;

	public Skills() throws Exception {
		con=ConnectionUtil.createConnection();
	}

	public void getSkills(int candidateId) throws Exception{
		cstmt=con.prepareCall("{call get_candidate_skill(?) }"); //Calling stored procedure with single parameter
		cstmt.setInt(1, candidateId);
		rs=cstmt.executeQuery();


		// Check if the ResultSet is empty
		if (!rs.next()) {
			System.out.println("No Skills");
		} else {
			// If there is data, process it
			do {
				System.out.println(String.format("%s - %s",
						rs.getString("first_name") + " "
								+ rs.getString("last_name"),
								rs.getString("skill")));
			} while (rs.next());
		}

		//		while (rs.next()) {
		//            System.out.println(String.format("%s - %s",
		//                    rs.getString("first_name") + " "
		//                    + rs.getString("last_name"),
		//                    rs.getString("skill")));
		//				}
		con.close();
	}
}
