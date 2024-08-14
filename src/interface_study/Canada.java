package interface_study;

public class Canada implements India
{
  public static void main(String[] args) {
	Canada c=new Canada();
	c.test();
	c.test1();
}
	@Override
	public void test()
	{
		System.out.println("test method from India interface completed in canada implementation class");
		
	}

	@Override
	public void test1() 
	{
		System.out.println("test1 method from India interface completed in canada implementation class");
		
	}
    
	public void test2()
	{
		System.out.println("canada class own method");
	}
	
	
}
