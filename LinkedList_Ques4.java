import java.util.Collections;
import java.util.LinkedList;

/*
 * Write a Java program of swap two elements in an linked list. 
 */

public class LinkedList_Ques4 {
	public static void main(String[] args) {
		LinkedList<String> l_list = new LinkedList<String>();
		   
	     l_list.add("A");
	     l_list.add("B");
	     l_list.add("C");
	     l_list.add("D");
	     l_list.add("E");
	     System.out.println("The Original linked list: " + l_list);
	     
	     
	      Collections.swap(l_list, 0, 4);
	      System.out.println("The New linked list after swap: " + l_list);
	}
}
