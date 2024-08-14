package Methodstudy;

public class City {

	public static void main(String[] args) {
		// To call non static method we need to create object,below in syntax to create
		//object
		//classname objectname= new classname();
		City pune = new City(); //created pune object
		// how to call non static method
		// objectname.methodname();
		pune.swargate();// calling non static method from same class
		katraj();// calling static method from same class

	}
	public static void katraj() // static method
	{
		System.out.println("katraj is static method from city class");
	}
	public void swargate() // non static method
	{
		System.out.println("swargate is non-static method from city class");
	}
}
