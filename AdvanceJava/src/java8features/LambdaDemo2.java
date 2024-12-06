package java8features;

/**
 * Author :Voggu.Reddy
 *Date :08-Nov-2024
 *Time :12:37:00 pm
 *Email :Voggu.Reddy@coforge.com
 */
// block lambda expressions
public class LambdaDemo2 {

	public static int main(String[] args) {

		MyString revstr=(str) ->{
			String results="";
			for(int i=str.length()-1;i>=0;i--) 

				results+=str.charAt(i);
			return results;

		};
		System.out.println(revstr.myStringFunction("lambda expression"));
		System.out.println(revstr.myStringFunction("Madam"));
		System.out.println(revstr.myStringFunction("Hello world java"));

		MyString myname=(name) -> {return "hello" +name;};
		System.out.println(myname.myStringFunction("james"));
		
		
		MyString st=(stl) ->{
			
			return "lenth os s"+ stl.length();
			
			
		};
		System.out.println(" lenth of string:"+st.myStringFunction("honey"));
		return 0;
		

			
	}

}
