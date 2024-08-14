package Methodstudy;

public class River {

	public static void main(String[] args) {
	River ganga=  new River();
	ganga. godavari();
	jamuna();

	}
	public static void jamuna()
	{
		System.out.println("jamuna is static method from river class");
	}
	public void godavari()
	{
		System.out.println("godavari is non static method from river class");
	}
}
