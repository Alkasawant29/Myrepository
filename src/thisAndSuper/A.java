package thisAndSuper;

public class A 
{
   int x=99;//global variable from A class
   int y=101;
   public static void main(String[] args) 
   {
	 A a=new A();
	a.Demo1();		 
 }
   
   public void Demo1()
   {
	   int x=12;//local variable from A class
	   int sum=100+this.x;//use global value of x using this keyword
	   System.out.println(sum);
	   
	   
	   int sub=100-x;//use local variable od x
	   System.out.println(sub);
   }
}
