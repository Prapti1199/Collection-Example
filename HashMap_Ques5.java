import java.util.HashMap;

/*
 * Write a Java program to get a shallow copy of a HashMap instance.
 */
public class HashMap_Ques5 {
	public static void main(String[] args) {
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  
		  hash_map.put(1,"A");
		  hash_map.put(2,"B");
		  hash_map.put(3,"C");
		  hash_map.put(4,"W");
		  hash_map.put(5,"Z");
		  System.out.println("The Original map: " + hash_map);
		   HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>(); 
		   new_hash_map = (HashMap)hash_map.clone();     
		   System.out.println("Cloned map: " + new_hash_map); 
	}
}
