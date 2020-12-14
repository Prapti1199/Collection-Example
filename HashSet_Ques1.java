import java.util.HashSet;
import java.util.Iterator;

/*
 * Write a Java program to iterate through all elements in a hash list.
 */
public class HashSet_Ques1 {
	public static void main(String[] args) {
		
	     HashSet<String> h_set = new HashSet<String>();
	 
	          h_set.add("A");
	          h_set.add("B");
	          h_set.add("W");
	          h_set.add("H");
	          h_set.add("Y");

	
	    Iterator<String> p = h_set.iterator();
	  
	   while (p.hasNext()) 
	   System.out.println(p.next());
	}
}
