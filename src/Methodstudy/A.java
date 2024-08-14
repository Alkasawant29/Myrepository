package Methodstudy;

public class A {
	public static void main(String[] args) {
    // To create object then follow syntax
	// classname objectname= new classname();
		
	A a = new A();// created object a from A class
	// to call non static method from same class
	//objectname.methodname();
	a.method1();
	
	// to call non static method from same class-->create an object of that class
	//to call swargate from city class, we need to create object city
	//class
	
	City mumbai= new City();
	// to call non static method from another class
	//objectname.methodname(0;
	mumbai.swargate();// called non static method from another class
	}
	
	public void	method1()
	{
		System.out.println(" this is non static method1");
	}
}
