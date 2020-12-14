import java.util.HashMap;
import java.util.Map;

/*
 * Write a Java program to associate the specified value with the specified key in a HashMap
 */
public class HashMap_Ques1 {
	public static void main(String[] args) {
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "R");
		  hash_map.put(2, "G");
		  hash_map.put(3, "B");
		  hash_map.put(4, "W");
		  hash_map.put(5, "C");
		  for(Map.Entry x:hash_map.entrySet()){  
		   System.out.println(x.getKey()+" "+x.getValue());  
		  }
	}
}
