import java.util.HashSet;

/*
 *  Write a Java program to compare two sets and retain elements which are same on both sets.
 */
public class HashSet_Ques4 {
	public static void main(String[] args) {
		
		HashSet<String> h_set1 = new HashSet<String>();
		 
        h_set1.add("A");
        h_set1.add("B");
        h_set1.add("W");
        h_set1.add("H");
        h_set1.add("Y");
        System.out.println("Frist HashSet content: "+h_set1);
        HashSet<String> h_set2 = new HashSet<String>();
		 
        h_set2.add("A");
        h_set2.add("B");
        h_set2.add("C");
        h_set2.add("H");
        h_set2.add("V");
        System.out.println("Frist HashSet content: "+h_set1);
        h_set1.retainAll(h_set2);
        System.out.println("HashSet content:");
        System.out.println(h_set1);
	}
}
