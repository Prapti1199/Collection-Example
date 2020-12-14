import java.util.SortedMap;
import java.util.TreeMap;

/*
 *  Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).
 */
public class TreeMap_Ques3 {
	public static void main(String[] args) {
		  TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();
		  SortedMap < Integer, String > sub_tree_map = new TreeMap < Integer, String > ();

		  tree_map1.put(10, "A");
		  tree_map1.put(20, "B");
		  tree_map1.put(40, "C");
		  tree_map1.put(50, "W");
		  tree_map1.put(60, "P");
		  
		  System.out.println("Orginal TreeMap content: " + tree_map1);
		  sub_tree_map = tree_map1.subMap(20, 60);
		  System.out.println("Sub map key-values: " + sub_tree_map);
	}
}
