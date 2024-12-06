package jdbcdemo;

/**
* Author : Singuluri.Kumar
* Date   : 07-Nov-2024
* Time   : 3:32:55 pm
* Email  : Singuluri.Kumar@coforge.com
*/

public class UpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidates c1 = new Candidates();
		try {
			c1.getConnection();
			c1.UpdateCandidate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
