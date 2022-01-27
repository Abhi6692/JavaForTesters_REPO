package collections_14;
import java.util.HashMap;
import java.util.Map.Entry;
public class HashMap_ClassConcept {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Abhishek");
		hm.put(2, "Sarkar");
		hm.put(3, "Rony");
		hm.put(4, "Bittu");
		
		hm.remove(4); //  Removing an value using key. 
		
		
		
	//	get(key) --> method present inside HashMap 
		
		
		System.out.println(hm);
		
		System.out.println("###############");
		System.out.println(hm.get(2)); //--> Print 'Sarkar' at the console.
		
		// This only prints the Value of the provided key.
		
		//--Imp --> To traverse the HashMAp i.e to print the key-value pair together
		// we us the below technique.
		
		// To traverse a HashMap , we use Entry Interface.
		
		for(Entry<Integer, String> e : hm.entrySet()) {
			
			
			//System.out.println("aaaaaaaa");
			System.out.println(e);
			//System.out.println("$$$$$$$$$$");
			System.out.println(e.getKey() + "   " + e.getValue());
			
			 // getKey()  and getValue() present inside Entry Interface.
		}
		
		
	}

}
