import java.util.PriorityQueue;

/*
 * Write a Java program to convert a Priority Queue elements to a string representation. 
 */
public class PriorityQueue_Ques4 {
	public static void main(String[] args) {
	    PriorityQueue<String> pq1 = new PriorityQueue<String>();  
	    pq1.add("R");
	    pq1.add("G");
	    pq1.add("B");
	    pq1.add("W");
	    System.out.println("Original Priority Queue: "+pq1);
	      
		String str1;
		   str1 = pq1.toString();
		   System.out.println("String representation of the Priority Queue: "+str1); 
	}
}
