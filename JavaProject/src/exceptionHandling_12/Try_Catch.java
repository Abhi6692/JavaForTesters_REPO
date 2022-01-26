 package exceptionHandling_12;

public class Try_Catch {

	
	public static void main(String[] args) {
		
		try {
			String str = "anand";
			System.out.println(str.charAt(9));
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {

			System.out.println("This is not possible");
			System.out.println(e.getMessage());

		}
		catch(StringIndexOutOfBoundsException e) {

			System.out.println("This is not possible");
			System.out.println(e.getMessage());
		}
		
		finally{
			
			System.out.println("I am in Finally Block");
		}
	}
	
	
}
