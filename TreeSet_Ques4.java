import java.util.TreeSet;

/*
 * Write a Java program to clone a tree set list to another tree set.
 */
public class TreeSet_Ques4 {
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
	   TreeSet<String> new_t_set = (TreeSet<String>)t_set.clone();
       System.out.println("Cloned tree list: " + new_t_set);
	  }
}
