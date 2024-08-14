package casting;

public class ClassCasting 
{
    public static void main(String[] args) 
    {
		Father f=new Father();
		f.car();
		f.car();
		System.out.println("==========");
		
		Son son=new Son();
		son.car();
		son.bike();
		son.laptop();
		System.out.println("============");
		
		Father f1=new Son();
		f1.car();
		f1.bike();
		//f1.laptop
		
		
	}
}
