package jdbcdemo;

import java.sql.Connection;
import java.sql.Statement;

/**
* Author : Singuluri.Kumar
* Date   : 07-Nov-2024
* Time   : 4:19:14 pm
* Email  : Singuluri.Kumar@coforge.com
*/

public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmt;
		int cnt=0;
		
		try {
			con=ConnectionUtil.createConnection();
			String sql="DELETE from candidates where rtrim(last_name) "
					+ "Like \'K%g\'";
			//String sql1="DELETE from candidates where id=101";
			stmt=con.createStatement();
			cnt = stmt.executeUpdate(sql);
			
			if(cnt>0) {
				System.out.println(cnt+" Records Deleted");
			}
			else {
				System.out.println("Records Not Found");
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
