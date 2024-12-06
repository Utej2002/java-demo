package pacakagedemo;
import com.coforge.training.microsoft.OperatingSystem;
import com.coforge.training.oracle.*;
/**
 * Author :Voggu.Reddy
 *Date :04-Nov-2024
 *Time :3:13:30 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class SoftwareList {

	public static void main(String[] args) {

		Database db1=new Database();

		OperatingSystem os1=new OperatingSystem();
		System.out.println("********Database Software***********");
		db1.printSoftware();

		System.out.println("*****operating system********");
		os1.listSoftware();
	}

}
