import java.util.TreeSet;

/*
 * Write a Java program to get the element in a tree set which is greater than or equal to the given element. 
 */
public class TreeSet_Ques1 {
	public static void main(String[] args) {
		 // creating TreeSet 
		   TreeSet <Integer>tree_num = new TreeSet<Integer>();
		   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
		     
		   // Add numbers in the tree
		   tree_num.add(10);
		   tree_num.add(22);
		   tree_num.add(36);
		   tree_num.add(25);
		   tree_num.add(16);
		   tree_num.add(70);
		   tree_num.add(82);
		   
		   
		   System.out.println("Greater than or equal to 80 : "+tree_num.ceiling(80));
		   System.out.println("Greater than or equal to 29 : "+tree_num.ceiling(29));
		   }    
}
