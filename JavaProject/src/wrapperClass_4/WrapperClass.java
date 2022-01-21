package wrapperClass_4;

public class WrapperClass {
public static void main(String[] args) {
		
		
		String s="100";
		System.out.println(s+20);
		
		
		//data conversion -->  string to integer
		int i=Integer.parseInt(s); // Converts any string to integer value 
		
		System.out.println(i+200);
		// Wrapper class -->  Integer , Double , Character, Boolean
		
		//stringProgramming to Double
		
		String s1= "12.33";
		double d= Double.parseDouble(s1); // Converts string to double.
		System.out.println(d + 11.24);
		
		
	   // stringProgramming to boolean
		
		String s3= "True";
		
		boolean b=Boolean.parseBoolean(s3);
		System.out.println(b);
		
		//int to string 
		
		int j =100;
		
		String s2 =String.valueOf(j); //converts integer to string 
		//System.out.println(s2+111);
		
		//NumberFormatException --> Generally asked in Interview
		
		String s4="100A";
		
		int I = Integer. parseInt(s4);
		
		System.out.println(I); 
		
		System.out.println(1234567890 + 10);
		
	}

}
