/*
 * Write a Java program to sort a given array list
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Ques3 {
	public static void main(String[] args) {
		  
		  List<Integer> list_int = new ArrayList<Integer>();
		  list_int.add(7);
		  list_int.add(5);
		  list_int.add(9);
		  list_int.add(10);
		  list_int.add(16);
		  list_int.add(11);
		  System.out.println("List before sort: "+list_int);
		  Collections.sort(list_int);
		  System.out.println("List after sort: "+list_int); 
	}
}
