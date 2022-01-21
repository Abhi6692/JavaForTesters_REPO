package string_2;

public class StringMethods {

	public static void main(String[] args) {
		String str = "This is the test string";

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Welcome";
		String str4 = "";
		String str5 = "            Spaces all around     ";
		String str6 = "Hello";
		String str7 = "U1,U2,U3";
		String Str8 = "I am new to Selenium  m";

		System.out.println("Length of the string is: " + str.length());
		System.out.println("Character at index 2 is: " + str.charAt(2));
		System.out.println(str.concat(" This is the appended string"));
		System.out.println("Contains check 1: " + str.contains("is"));
		System.out.println("Contains check 2: " + str.contains("si"));
		System.out.println("Starts with check 1: " + str.startsWith("This"));
		System.out.println("Starts with check 2: " + str.startsWith("is"));
		System.out.println("Ends with check 2: " + str.endsWith("string"));
		System.out.println("Ends with check 2: " + str.endsWith("is"));
		System.out.println("Check contents are equal: " + str1.equals(str2));
		System.out.println("Check contents are equal: " + str1.equals(str3));		
		System.out.println("Index of 'h' is: " + str.indexOf('h'));
		System.out.println("Check if string is empty 1: " + str.isEmpty());
		System.out.println("Check if string is empty 2: " + str4.isEmpty());
		System.out.println("Trim the leading and trailing spaces: " + str5.trim());
		System.out.println("Replace Example: " + str6.replace('e', 'a'));

		System.out.println("Substring Example 1: " + str.substring(5));
		System.out.println("Substring Example 2: " + str.substring(5, 10));

		char[] charArray = str.toCharArray();
		for (int i = 0; i<charArray.length; i++) {
			System.out.println("Index " + i + " is: " + charArray[i]);
		}

		System.out.println("Lower case: " + str.toLowerCase());
		System.out.println("Upper case: " + str.toUpperCase());

		String[] users = str7.split(",");
		for (int i = 0; i<users.length; i++) {
			System.out.println("Index " + i + " is: " + users[i]);
		}

		//Occurence of first m
		System.out.println(Str8.indexOf('m'));

		//Occurence of Second m
		System.out.println(Str8.indexOf('m', 4));

		System.out.println(Str8.indexOf('m', Str8.indexOf('m')+1));



	}

}
