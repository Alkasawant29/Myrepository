package thisAndSuper;

public class B extends A
{
  int x=1;//global variable from class B(subclass)
  
  public static void main(String[] args)
  {
	B b=new B();
	b.Demo2();
}
  
  public void Demo2()
  {
	  int x=2;//local variable of class B(subclass)
	  int sum1=100+x;//use local value of x
	  System.out.println(sum1);
	  
	  int sum2=100+this.x;//use global value of x from class B(subclass)
	  System.out.println(sum2);
	  
	  int sum3=100+super.x;//use global value of x from super class A
	  System.out.println(sum3);
	  
	  int sum4=100+y;//used superclass global variable
	  //as there is no y variable in subclass ,so there is  no need of super keyword
	  
	  
	  
	  
  }
  
}
