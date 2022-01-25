package inheritance_8;

public class User {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone_1 T = new Telephone_1();
		T.calling(); 
		
		Mobile_2 M = new Mobile_2();
		M.texting();
		M.calling();
		

		Smartphone_3 S=new Smartphone_3();
		S.internet();
		S.calling();
		S.texting();
		
		 
	}
}
