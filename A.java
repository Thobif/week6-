package package1;

public class A {
	String messageA = "Class A";// instance variable
	
	//creating a default constructor
	public A() {
		System.out.println("Class A");
	}
   
	public static void main(String[]args) {
		//calling a default constructor
    	A objA = new A(); //objA object 
    	B objB = new B(); //objB object
    }
}
