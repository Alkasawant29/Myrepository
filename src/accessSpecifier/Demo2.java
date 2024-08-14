package accessSpecifier;

public class Demo2 
{
 public static void main(String[] args) 
 {
	Demo1 demo1=new Demo1();
	//demo1.test1();//calling private method in another class
	
	demo1.test2();//calling default method in another class
	
}
}
