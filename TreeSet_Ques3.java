import java.util.Iterator;
import java.util.TreeSet;

/*
 * Write a Java program to create a reverse order view of the elements contained in a given tree set.
 */
public class TreeSet_Ques3 {
	public static void main(String[] args) {
	    // create an empty tree set
	     TreeSet<String> t_set = new TreeSet<String>();
	   // use add() method to add values in the tree set
	          t_set.add("A");
	          t_set.add("B");
	          t_set.add("C");
	          t_set.add("D");
	          t_set.add("E");
	     // print original list
	   System.out.println("Original tree set:" + t_set);  
	     Iterator it = t_set.descendingIterator();
	     // Print list elements in reverse order
	     System.out.println("Elements in Reverse Order:");
	     while (it.hasNext()) {
	        System.out.println(it.next());
	     }
	  }
}
