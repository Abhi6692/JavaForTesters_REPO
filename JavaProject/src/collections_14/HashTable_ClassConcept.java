package collections_14;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class HashTable_ClassConcept {
	public static void main(String[] args) {

		Hashtable<String, Character> ht = new Hashtable<String, Character>();

		ht.put("Abhishek", 'M');
		ht.put("Ranu", 'F');
		ht.put("Gandu", 'M');
		ht.put("Suraj", 'M');

		System.out.println(ht.get("Gandu")); // Fetch the value on the basis of key


		// Important Techniques --> 
		//  1> To print all the Keys  --> Use keySet() method
		// 2> To print all the Values --> Use Enumeration
		//  3> To print both Key-value --> Use Entry Interface	 , 
		//always used inside  enhanced for loop

		//Prints all the Keys
		Set<String> S=ht.keySet();
		System.out.println("The keys are  "+S);// Gives list view
        
		Iterator<String> I = S.iterator();
		System.out.println("All the Keys Are ******");
		while(I.hasNext()) {

			System.out.println(I.next());
		}

		//Prints all the Values via Enumeration (Similar to Iterator)
		Enumeration<Character> e = ht.elements();

		while(e.hasMoreElements()) {

			// This line will print 'M' , 'F' ...
			System.out.println(e.nextElement()); 
		}


		//Traverse the HashTable

		for(Entry<String, Character> E : ht.entrySet()) {

			System.out.println("The Key is  "+ E.getKey());
			System.out.println("The Value is " + E.getValue());













		}

	}
}
