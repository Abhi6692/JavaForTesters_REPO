package arrays_3;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object objArray[]=new Object[5];

		objArray[0]=100;
		objArray[1]='M';
		objArray[2]=true;
		objArray[3]="Abhishek";
		objArray[4]=12.22;

	
		//Enhanced for loop

		for (Object o:objArray) 

		{

			System.out.println(o);
		}


}
}