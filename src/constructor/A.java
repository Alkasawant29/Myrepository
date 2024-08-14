package constructor;

public class A 
{
  public A()
  {
	  this(45);//constructor chaining
	  //calling another contructor in constructor
	  System.out.println("user defined zero parameter constructer");
  }
  public A(int a)
  {
	  System.out.println("user defined single parameter constructor");
	  System.out.println(a);
  }
  public A(String name)
  {
	 System.out.println(name); 
  }
  
  public static void main(String[] args) {
	A a=new A();
	A a1=new A(99);
	
	
}
}
