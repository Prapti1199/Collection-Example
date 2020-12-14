import java.util.ArrayList;
import java.util.HashSet;

/*
 * Write a Java program to convert a hash set to a List/ArrayList.
 */
public class HashSet_Ques5 {
	public static void main(String[] args) {
		HashSet<String> h_set1 = new HashSet<String>();
		 
        h_set1.add("A");
        h_set1.add("B");
        h_set1.add("W");
        h_set1.add("H");
        h_set1.add("Y");
        System.out.println(" HashSet content: "+h_set1);
        
       ArrayList<String> list = new ArrayList<String>(h_set1);
        
      
        System.out.println("ArrayList contains: "+ list);
	}
}
