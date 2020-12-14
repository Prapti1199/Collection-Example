import java.util.SortedMap;
import java.util.TreeMap;

/*
 * Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key.
 * Return null if there is no such key.
 */
public class TreeMap_Ques4 {
	public static void main(String[] args) {
		TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
		 
		  tree_map.put(10, "A");
		  tree_map.put(20, "B");
		  tree_map.put(40, "C");
		  tree_map.put(50, "W");
		  tree_map.put(60, "P");
		  System.out.println("Orginal TreeMap content: " + tree_map);
		  System.out.println("Keys greater than or equal to 20: " + tree_map.ceilingEntry(20));
		  System.out.println("Keys greater than or equal to 40: " + tree_map.ceilingEntry(40));
		  System.out.println("Keys greater than or equal to 50: " + tree_map.ceilingEntry(50));

	}
}
