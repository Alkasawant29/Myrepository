package thisAndSuper;

public class Sample 
{
    int a=90;//static global variable
    int b=10;
    static int x=88;
    public static void main(String[] args)
    {
		Sample sample=new Sample();
		sample.add();
	}
	
	public void add()
	{
		int a=10;//local variable
		int sum = a +100;//by default java will use local variable
		System.out.println(sum);
		
		int sum1=this.a+ 100;//called global variable use this keyword
		System.out.println(sum1);
		
		int sub=100-b;
		
		
		int x=100;
		int sub1=100-x;//called local variable
		System.out.println(sub1);
		int sub2=100-Sample.x;//called global variable
		System.out.println(sub2);
		
		
		
		
	}
	
}
