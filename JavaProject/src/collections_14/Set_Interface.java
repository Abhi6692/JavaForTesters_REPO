package collections_14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_Interface {

	public static void main(String[] args) {
		
		
		// HashSet --> Random order
		Set<Integer> S = new HashSet<Integer>();
		S.add(20);
		S.add(21);
		S.add(22);
		S.add(23);

		
	
		//I did not see any method to fetch any element form a set.
		
		
		for (Integer i : S)
		{
			
			System.out.println(i);
		}
		
		//LinkedHashSet -- Insertion order is preserved
		
		Set<Integer> S1 = new LinkedHashSet<Integer>();
		S1.add(100);
		S1.add(200);
		S1.add(300);
		S1.add(400);
		
		
		for (Integer i : S1)
		{
			
			System.out.println(i);
		}
		
		
		//TreeSet --> Sorts in increasing order 
		Set<Integer> S3 = new TreeSet<Integer>();
		S.add(25);
		S.add(21);
		S.add(22);
		S.add(23);
		S.add(22);
		S.add(23);
		
		
		//using enhanced for loop 
		for (Integer i : S)
		{
			
			System.out.println(i);
		}
		
		
		//Using Iterator
		Iterator<Integer> I = S3.iterator();
		
		while(I.hasNext()) {
			
			System.out.println(I.next());
		}
		
		
		 // how to convert a Set to List 
		Set<String> Set_to_List =new HashSet<String>();
		Set_to_List.add("Abhi");
		Set_to_List.add("Abhi");// add() method returns false for duplicate
		Set_to_List.add("Abhi");
		Set_to_List.add("Abhi");
		
		System.out.println(Set_to_List);
		
		List<String> AL = new ArrayList<String>(Set_to_List);
		
		AL.add("Rony");
		AL.add("Rony");
		System.out.println(AL);
		
	}

}

