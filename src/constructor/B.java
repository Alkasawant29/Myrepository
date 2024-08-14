package constructor;

public class B extends A
{
  public B()
  {
	  super(33);//calling superclass constructer in subclass
	  System.out.println("class B constructor");
  }
  public B(int b)
  {
	  System.out.println("class  constructor"+b);
  }
  public static void main(String[] args) {
	B b=new B();
}
}
