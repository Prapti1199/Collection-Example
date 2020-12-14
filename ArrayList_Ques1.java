/*
 * Write a Java program to iterate through all elements in a array list. 
 */
import java.util.ArrayList;
import java.util.List;

public class ArrayList_Ques1 {
		  public static void main(String[] args) {
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("A");
		  list_Strings.add("B");
		  list_Strings.add("C");
		  list_Strings.add("D");
		 for(String s : list_Strings)
		  System.out.println(s);
		 }
}
