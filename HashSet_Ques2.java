import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Write a Java program to convert a hash set to a tree set
 */
public class HashSet_Ques2 {
	public static void main(String[] args) {
		HashSet<String> h_set = new HashSet<String>();
		 
        h_set.add("A");
        h_set.add("B");
        h_set.add("W");
        h_set.add("H");
        h_set.add("Y");

		Set<String> tree_set = new TreeSet<String>(h_set);
		 
	     
	     System.out.println("TreeSet elements: ");
	     for(String element : tree_set)
	        System.out.println(element);
	}
}
