import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Write a Java program to convert a linked list to array list.
 */
public class LinkedList_Ques3 {
	public static void main(String[] args) {
		LinkedList<String> l_list = new LinkedList<String>();
		   
	     l_list.add("A");
	     l_list.add("B");
	     l_list.add("C");
	     l_list.add("D");
	     l_list.add("E");
	     
	     List<String> a_list = new ArrayList<String>(l_list);

	     for (String str : a_list)
	       System.out.println(str);
	}
}
