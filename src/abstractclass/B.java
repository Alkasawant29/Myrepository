package abstractclass;

public class B extends A {

	public static void main(String[] args) 
	{
		//concrete class
		B b=new B();
	    b.test1();
	    b.test2();
	    b.test3();
	    b.test4();

	}

	@Override
	public void test3()
	{
	  System.out.println("class A's method completed in concrete class");	
		
	}

	@Override
	public void test4() 
	{
		System.out.println("class A's method completed in concrete class");
		
	}
    public void test5()
    {
    	System.out.println("class B's own method" );
    }
}
