import java.util.PriorityQueue;

/*
 * Write a Java program to compare two priority queues.
 */
public class PriorityQueue_Ques2 {
	public static void main(String[] args) {
		  
		        PriorityQueue<String> pq1 = new PriorityQueue<String>();  
		          pq1.add("R");
		          pq1.add("G");
		          pq1.add("B");
		          pq1.add("W");
		          System.out.println("First Priority Queue: "+pq1);
		          PriorityQueue<String> pq2 = new PriorityQueue<String>();  
		          pq2.add("R");
		          pq2.add("P");
		          pq2.add("B");
		          pq2.add("O");
		          System.out.println("Second Priority Queue: "+pq2);
		   
		         for (String element : pq1)
		             System.out.println(pq2.contains(element) ? "Yes" : "No");
		             
		     }
}
