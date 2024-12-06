package oopsdemo1;

/**
 * Author :Voggu.Reddy
 *Date :26-Oct-2024
 *Time :4:12:25 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class Language { 

	private String name;
	private float version;

	//generate default constructor

	public Language() {
		this.name="java";
		this.version=8.0f;
		System.out.println(" The language is:"+this.name+"-v"+this.version);
	}
	//constructor with one string parameter
	public Language(String name)
	{
		this.name=name;
		this.version=5.0f;

	}
	public Language(float version) {

		this.version=version;
		this.name="python";
		System.out.println(" The Language is: "+this.name+"-v"+this.version);
	}
	//Generate Constructor with 2 parameters
	public Language(String name, float version) {
		this.name = name;
		this.version = version;
		System.out.println(" The Language is: "+this.name+"-v"+this.version);
	}

}
