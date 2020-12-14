import java.util.HashMap;
import java.util.Set;

/*
 * Write a Java program to get a set view of the keys contained in this map.
 */
public class HashMap_Ques3 {
	public static void main(String args[]){  
		 
		  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  
		  hash_map.put(1,"A");
		  hash_map.put(2,"B");
		  hash_map.put(3,"C");
		  hash_map.put(4,"W");
		  hash_map.put(5,"Z");
		
		   Set keyset = hash_map.keySet();

		   System.out.println("Key set values are: " + keyset);  
		 }
}
