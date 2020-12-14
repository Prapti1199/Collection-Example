import java.util.Iterator;
import java.util.LinkedList;

/*
 * Write a Java program to iterate through all elements in a linked list starting at the specified position. 
 */
public class LinkedList_Ques1 {
	public static void main(String[] args) {
	
		    LinkedList<String> l_list = new LinkedList<String>();
		   
		     l_list.add("A");
		     l_list.add("B");
		     l_list.add("C");
		     l_list.add("D");
		     l_list.add("E");
	
		   Iterator p = l_list.listIterator(1);

		   while (p.hasNext()) {
		   System.out.println(p.next());
		   
		   }
		
	}
}
