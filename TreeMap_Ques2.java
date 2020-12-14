import java.util.TreeMap;

/*
 * Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key. 
 */
public class TreeMap_Ques2 {
	public static void main(String[] args) {
		TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();
	
		  tree_map1.put(10, "A");
		  tree_map1.put(20, "B");
		  tree_map1.put(40, "C");
		  tree_map1.put(50, "W");
		  tree_map1.put(60, "P");

		  System.out.println("Orginal TreeMap content: " + tree_map1);
		  System.out.println("Checking the entry for 10: ");
		  System.out.println("Value is: " + tree_map1.floorEntry(10));
		  System.out.println("Checking the entry for 30: ");
		  System.out.println("Value is: " + tree_map1.floorEntry(30));
		  System.out.println("Checking the entry for 70: ");
		  System.out.println("Value is: " + tree_map1.floorEntry(70));
		 
	}
}
