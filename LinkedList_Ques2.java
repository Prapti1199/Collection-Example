import java.util.LinkedList;

/*
 * Write a Java program to test an linked list is empty or not.
 */

public class LinkedList_Ques2 {
	public static void main(String[] args) {
		 LinkedList<String> l_list = new LinkedList<String>();
		   
	     l_list.add("A");
	     l_list.add("B");
	     l_list.add("C");
	     l_list.add("D");
	     l_list.add("E");

	     System.out.println("Original linked list: " + l_list);
         System.out.println("Check the above linked list is empty or not! "+l_list.isEmpty());
         l_list.removeAll(l_list);
         System.out.println("Linked list after remove all elements "+l_list);   
         System.out.println("Check the above linked list is empty or not! "+l_list.isEmpty());
	   
	   
	}
}
