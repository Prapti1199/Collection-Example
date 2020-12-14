import java.util.Comparator;
import java.util.TreeMap;

/*
 * Write a Java program to sort keys in Tree Map by using comparator.
 */
public class TreeMap_Ques1 {
	
	
	public static void main(String[] args) {
		TreeMap<String,String> tree_map1 = new TreeMap<String,String>(new sort_key());
		   // Put elements to the map 
		  tree_map1.put("C2", "XYZ");
		  tree_map1.put("C4", "ABC");
		  tree_map1.put("C3", "PQR");
		  tree_map1.put("C1", "MNO"); 
		  System.out.println(tree_map1); 
	}
}
	
class sort_key implements Comparator<String>{
    @Override
   public int compare(String str1, String str2) {
       return str1.compareTo(str2);
   }
}

	 
