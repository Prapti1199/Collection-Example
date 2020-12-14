import java.util.TreeMap;

/*
 * Write a Java program to copy a Tree Map content to another Tree Map.
 */
public class TreeMap_Ques5 {
public static void main(String[] args) {
	TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
	 
	  tree_map.put(10, "A");
	  tree_map.put(20, "B");
	  tree_map.put(40, "C");
	  tree_map.put(50, "W");
	  tree_map.put(60, "P");
	  System.out.println("Tree Map 1: "+tree_map);
	   TreeMap<Integer,String> tree_map2 = new TreeMap<Integer,String>();
	   tree_map2.put(100, "O");
	   tree_map2.put(70, "M");
	   System.out.println("Tree Map 2: "+tree_map2);
	   tree_map.putAll(tree_map2);
	   System.out.println("After coping map2 to map1: "+tree_map);   
}
}
