import java.util.HashMap;

/*
 * Write a Java program to test if a map contains a mapping for the specified key.
 */

public class HashMap_Ques2 {
	 public static void main(String args[]) {
		  HashMap < String, Integer > hash_map = new HashMap < String, Integer > ();
		  hash_map.put("Red", 1);
		  hash_map.put("Green", 2);
		  hash_map.put("Black", 3);
		  hash_map.put("White", 4);
		  hash_map.put("Blue", 5);
		  
		  System.out.println("The Original map: " + hash_map);
		  System.out.println("1. Is key 'Green' exists?");
		  if (hash_map.containsKey("Green")) {
	
		   System.out.println("yes! - " + hash_map.get("Green"));
		  } else {
		   
		   System.out.println("no!");
		  }

		  System.out.println("\n2. Is key 'orange' exists?");
		  if (hash_map.containsKey("orange")) {
		   System.out.println("yes! - " + hash_map.get("orange"));
		  } else {
		   System.out.println("no!");
		  }
	 }
}
