package collections_14;
import java.util.LinkedList;
public class LinkedList_ClassConcept {
public static void main(String[] args) {
		
		
		LinkedList<String> LL = new LinkedList<String>();
		LL.add("Abhishek");
		LL.add("rony");
		LL.add("Nita");
		LL.add("pita");
		
		LL.addFirst("FirstAbhishek"); // Add element at the begenning
		LL.addLast("LastAbhishek"); // Add element at the last
		
		System.out.println(LL);
		
		System.out.println(LL.get(0)); // Fetches any element based on index
		
		LL.set(0, "SetElement"); //  Set the element at the respective index
	     System.out.println(LL.get(0));
	     
	     System.out.println(LL);
	     
	     LL.removeFirst(); // Remove first element
	     LL.removeLast();  // Remove last element
	     
	     System.out.println(LL);
	     
	     //How to Iterate
	     
	     System.out.println("******************* ");
	     for (String S : LL) {
	    	 System.out.println(S);
	     }
	}
}
