/*
 * Write a Java program to extract a portion of a array list.
 */
import java.util.List;
import java.util.ArrayList;

public class ArrayList_Ques4 {
	public static void main(String[] args) {
		  
		  List<Integer> list_int = new ArrayList<Integer>();
		  list_int.add(7);
		  list_int.add(5);
		  list_int.add(9);
		  list_int.add(10);
		  list_int.add(16);
		  list_int.add(11);
		  System.out.println("Original list: "+list_int);
		  List<Integer> list_int1 = list_int.subList(1, 4);
		  System.out.println("Sublist : "+list_int1); 
	}
}
