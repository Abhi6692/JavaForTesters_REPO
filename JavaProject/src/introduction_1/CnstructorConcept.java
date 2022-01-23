package introduction_1;

public class CnstructorConcept {

	//Class/Instance Variable
	String name;
	int age;



	//Default constructor
	public CnstructorConcept() {

		System.out.println("Deafult COnstructor");
	}

	// 1 Parameter
	public CnstructorConcept(int i) { 

		System.out.println("1 Param Constructor");
		System.out.println(i);


	}
	// 2 parameter 

	public CnstructorConcept(int i , int j) { 

		System.out.println("2 Param Constructor");
		System.out.println(i);
		System.out.println(j);
	}

	public CnstructorConcept(String name , int age)// this name and age is different form the class variables
	// name and age here is local variable.
	{
		// this keyword is used to initialize class variables via local variables.
		this.name = name; // this.classVAriables = localVariables
		this.age =  age;

	}

	public static void main(String[] args) {
		// To call the constructor , we need to create the object of that class.
		//But as soon as the object is created , the constructor will be called automatically.
		//No need to call constructor  using (.) operator.

		CnstructorConcept C = new CnstructorConcept(); //This line will automatically call the constructor 
		CnstructorConcept C1 = new CnstructorConcept(10);
		CnstructorConcept C2 = new CnstructorConcept(20, 30);
		CnstructorConcept C3= new CnstructorConcept("ABHISHEK", 27);


		System.out.println(C.name);// Return the value of name as null as its not initialized.
		System.out.println(C1.name);//Return the value of name as null as its not initialized.
		System.out.println(C2.name);// Return the value of name as null as its not initialized.
		System.out.println(C3.name); // Return ABHISHEK.
		System.out.println(C3.age); //Returns 27
	}

}
