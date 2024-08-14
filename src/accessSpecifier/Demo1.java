package accessSpecifier;

public class Demo1
{
  private int a=10;
  int b=20;
  public static void main(String[] args)
  {
	Demo1 demo=new Demo1();
	demo.test1();//calling private method within class
	System.out.println("demo.a");//calling private global method within class
	 
	demo.test2();
	System.out.println("demo.b");
	  
	  
}
  private void test1()
  {
	System.err.println("This is Demo's private test1 method");  
  }
  void test2()
  {
	  System.out.println("This is Demos default test2 method");
  }
}
