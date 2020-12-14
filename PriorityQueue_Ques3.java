import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/*
 * Write a Java program to convert a priority queue to an array containing all of the elements of the queue.
 */
public class PriorityQueue_Ques3 {
	public static void main(String[] args) {

		    PriorityQueue<String> pq1 = new PriorityQueue<String>();  
		    pq1.add("Red");
		    pq1.add("Green");
		    pq1.add("Black");
		    pq1.add("White");
		    System.out.println("Original Priority Queue: "+pq1);
		      
		   List<String> array_list = new ArrayList<String>(pq1);
		   System.out.println("Array containing all of the elements in the queue: "+array_list);
	}
		    
}
