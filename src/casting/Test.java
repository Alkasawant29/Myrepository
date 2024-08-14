package casting;

public class Test {

	public static void main(String[] args)
	{
		//primitive casting
		
		//implicit casting
       byte a=9;
       System.out.println(a);//--->no data loss
       float b=a;//memory-->loss,increase
       System.out.println(b);//widining casting
       System.out.println("============");
	
	  //explicit casting
	  float x=99.99f;
	  System.out.println(x);//--->data loss -->yes
	  byte y=(byte)x;//memory-->save,decrease
	  System.out.println(y);//narrowing casting
	  

	

	}
}
