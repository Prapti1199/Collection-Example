/*
 * Write a Java program to increase the size of an array list.
 */
import java.util.ArrayList;

public class ArrayList_Ques5 {
	public static void main(String[] args) {
		  
		  ArrayList<Integer> list_int = new ArrayList<Integer>();
		  list_int.add(7);
		  list_int.add(5);
		  list_int.add(9);
		  list_int.add(10);
		  list_int.add(16);
		  list_int.add(11);
		  System.out.println("Original list: "+list_int);
		  list_int.ensureCapacity(9);
		  list_int.add(19);
		  list_int.add(23);
		  list_int.add(30);
		  System.out.println("After increasing the size : "+list_int); 
	}
}
