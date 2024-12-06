package collectionsdemo;

import java.util.Vector;

/**
 * Author :Voggu.Reddy
 *Date :05-Nov-2024
 *Time :3:12:26 pm
 *Email :Voggu.Reddy@coforge.com
 */

class PreciousStones{
	Vector<String>preciousVector;

	PreciousStones(){
		preciousVector = new Vector<String>();
	}
	void add() {
		preciousVector.addElement("Jade");
		preciousVector.addElement("Topaz");
		preciousVector.addElement("Turquoise");
		preciousVector.addElement("Emerald");
	}
	void insert() {
		preciousVector.insertElementAt("Diamond" , 0);
		preciousVector.insertElementAt("Opal" , 4);
	}

	void search() {
		System.out.println("***************************");
		System.out.println("Searching Contents :");
		System.out.println("***************************");
		String searchStone = "Diamond";
		if (preciousVector.contains(searchStone)) {
			System.out.println("Found " + searchStone
					+ " at index " + preciousVector.indexOf(searchStone));
		}
	}
	void otherDetails() {
		System.out.println("\nFirst Element = "
				+ preciousVector.firstElement());
		System.out.println("Default Capacity = "
				+ preciousVector.capacity());
		System.out.println("Last Element = "
				+ preciousVector.lastElement());
	}

	void display()
	{
		System.out.println(preciousVector);
	}
}

public class VectorDemo {

	public static void main(String[] args) {

		PreciousStones ps=new PreciousStones();

		ps.add();
		ps.display(); 
		ps.insert();
		ps.search();
		ps.otherDetails();
		ps.display();

	}

}
