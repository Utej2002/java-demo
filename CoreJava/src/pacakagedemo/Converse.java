package pacakagedemo;

/**
* Author :Voggu.Reddy
*Date :04-Nov-2024
*Time :4:11:22 pm
*Email :Voggu.Reddy@coforge.com
*/

public class Converse {
	void tobeConvert() {
        String binary, hex, octal;
        int num = 100;
       
        binary = Integer.toBinaryString(num);
        hex = Integer.toHexString(num);
        octal = Integer.toOctalString(num);

        System.out.println("Decimal value : " + num);
        System.out.println("Binary equivalent = " + binary);
        System.out.println("Hexadecimal equivalent = " + hex);
        System.out.println("Octal equivalent = " + octal);
    }
	public static void main(String[] args) {
		
		Converse c=new Converse();
		
		c.tobeConvert();
		
		System.out.println(Integer.sum(34, 56));
	}

}
