package collections_14;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
public class MapInterface {

	public static void main(String[] args) {
		// Key Values Pairs
		
		//HashMap
		Map<String, Integer> M = new HashMap<String, Integer>();
		M.put("Abhishek", 27);
		M.put("Abhi", 20);
		M.put("Bittu", 16);
		M.put(null, 27); // Allows null key,
		
		System.out.println(M.get(null));
		
		
		//HashTable 
		
		Map<String, Integer> M1 = new Hashtable<String, Integer>();
		M1.put("Abhishek", 27);
		M1.put("Abhi", 20);
		M1.put("Bittu", 16);
		M1.put("Bittu", 17);
		M1.put("Bittu", 178);
		//M1.put(null, 16); // does not allow null key --> NullPointerException
		//System.out.println(M1.get("Bittu"));
		
		Set<String> set1=M1.keySet();
		
		for(String s:set1) {
			System.out.println(s);
		}
		
		
		

	}
}
