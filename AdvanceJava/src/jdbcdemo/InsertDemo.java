package jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
* Author : Singuluri.Kumar
* Date   : 07-Nov-2024
* Time   : 3:00:12 pm
* Email  : Singuluri.Kumar@coforge.com
*/

public class InsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		int count;
		try {
			con = ConnectionUtil.createConnection();
			String str= "Insert into skills (name) values ('Node Js')";
			stmt = con.createStatement();
			
			count = stmt.executeUpdate(str); //return no of records affected
			
			if(count>0) {
				System.out.println("Record Inserted Successfully");
			}
			
			//count total no of records in table
			
			String str1="SELECT COUNT(id) FROM skills";
			rs=stmt.executeQuery(str1);
			int cnt=0;
			
			while(rs.next())
			{
				cnt=rs.getInt(1);
			}
			System.out.println("Total no of records is "+cnt);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
