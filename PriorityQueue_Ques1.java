import java.util.PriorityQueue;
/*
 * Write a Java program to add all the elements of a priority queue to another priority queue.
 */
public class PriorityQueue_Ques1 {
	public static void main(String[] args) {
		
			  PriorityQueue<String> queue1 = new PriorityQueue<String>();  
			  queue1.add("A");
			  queue1.add("G");
			  queue1.add("O");
			  System.out.println("Priority Queue1: "+queue1);
			  PriorityQueue<String> queue2 = new PriorityQueue<String>();  
			  queue2.add("P");
			  queue2.add("W");
			  queue2.add("B");
			  System.out.println("Priority Queue2: "+queue2);
			   queue1.addAll(queue2);
			   System.out.println("New Priority Queue1: "+queue1);
			 
	}
}
