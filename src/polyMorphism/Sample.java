package polyMorphism;

public class Sample {

	public static void main(String[] args)
	{
		Sample sample=new Sample();
		sample.sum();
		sample.sum(2, 4);
		
	}	
		// Method overloading:
		// Declaring multiple methods with same method name but with different argument
		//in a same class is called method overloading.
	   
	  public void sum()
	  {
		 int a=20;
		 int b=30;
		 int sum=a+ b;
		 System.out.println("sum is"+sum);
	  }
      public void sum(int a,int b)
      {
    	int sum=a+b;
    	System.out.println("sum is"+sum);
      }
}
