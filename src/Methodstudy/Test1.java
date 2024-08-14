package Methodstudy;

public class Test1 {

	public static void main(String[] args)
	{
		System.out.println("Main method running");
         m1();
         Test1 test1=new Test1();
         test1.m2();
         System.out.println("Method is running smoothly");
         Test2.m3();
         Test2 test2 = new Test2();
         test2.m4();
         System.out.println("Main method is finished");
	}
	
    public static void m1() 
    {
    	System.out.println("This is static regular m1 method fron test1 class");
    }
    public void m2() 
    {
    	System.out.println("This is non static regular m2 method from test1 class");
    }
}
