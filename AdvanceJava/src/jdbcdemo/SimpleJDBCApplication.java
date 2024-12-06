package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
* Author : Singuluri.Kumar
* Date   : 07-Nov-2024
* Time   : 10:50:06 am
* Email  : Singuluri.Kumar@coforge.com
*/

public class SimpleJDBCApplication {

	public static void main(String[] args) {
		
		try {
			//load the jdbc drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish the connection
			String url="jdbc:mysql://localhost:3306/classicmodels";
			String username ="root";
			String password ="cfg@1234";
			Connection cn=DriverManager.getConnection(url,username,password);
			
			//execute the query
			Statement st=cn.createStatement();
			 String sql ="Select*FROM employees";
			 ResultSet rs=st.executeQuery(sql);
			 //process the result
			 System.out.println("Employee Number\t FirstName\t Designation");
			 while(rs.next()) {
				 int id = rs.getInt("employeeNumber");
				 String name =rs.getString("firstName");
				 
				 System.out.println(id+"\t\t "+name+"\t\t "+rs.getString(8));
		}
			 //close resources
			 rs.close();
			 st.close();
			 cn.close();
		
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
