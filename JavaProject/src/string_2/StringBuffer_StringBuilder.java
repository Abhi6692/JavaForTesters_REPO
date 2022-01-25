package string_2;

public class StringBuffer_StringBuilder {
public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer("Abhishek");
		
		 StringBuilder sB = new StringBuilder("ABJHI");
		System.out.println(sb.capacity());
		
		sb.append("  Sarkar");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.deleteCharAt(8);
		System.out.println(sb);
		
		sb.insert(1, "Abhi");
		System.out.println(sb);
		
		sb.delete(0,2);
		System.out.println(sb);
		
		//The difference between replace() and replaceAll() 
		//method is that the replace() method replaces all the 
		//occurrences of old char with new char while replaceAll() 
		//method replaces all the occurrences of old string with 
		//the new string.
	}
}
