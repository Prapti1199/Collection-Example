import java.util.LinkedList;

/*
 * Write a Java program to get the first and last occurrence of the specified elements in a linked list. 
 */
public class LinkedList_Ques5 {
	public static void main(String[] args) {
		LinkedList<String> l_list = new LinkedList<String>();
		   
	     l_list.add("A");
	     l_list.add("B");
	     l_list.add("C");
	     l_list.add("D");
	     l_list.add("E");
	     System.out.println("Original linked list:" + l_list);  
	     
	      Object first_element = l_list.getFirst();
	      System.out.println("First Element is: "+first_element);
	   
	      Object last_element = l_list.getLast();
	      System.out.println("Last Element is: "+last_element);
	}
}
