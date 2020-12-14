import java.util.HashMap;

/*
 * Write a Java program to get a collection view of the values contained in this map.
 */
public class HashMap_Ques4 {
	public static void main(String[] args) {
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  
		  hash_map.put(1,"A");
		  hash_map.put(2,"B");
		  hash_map.put(3,"C");
		  hash_map.put(4,"W");
		  hash_map.put(5,"Z");
		  System.out.println("Collection view is : "+hash_map.values());
	}

}
