import java.util.HashSet;


/*
 * Write a Java program to compare two hash set.
 */
public class HashSet_Ques3 {
	public static void main(String[] args) {
		
			HashSet<String> h_set1 = new HashSet<String>();
			 
	        h_set1.add("A");
	        h_set1.add("B");
	        h_set1.add("W");
	        h_set1.add("H");
	        h_set1.add("Y");
	        
	        HashSet<String> h_set2 = new HashSet<String>();
			 
	        h_set2.add("A");
	        h_set2.add("B");
	        h_set2.add("C");
	        h_set2.add("H");
	        h_set2.add("V");
	        
	         for (String element : h_set1)
	             System.out.println(h_set2.contains(element) ? "Yes" : "No");

			
	}
}
