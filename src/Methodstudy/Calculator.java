package Methodstudy;

public class Calculator {
    int a = 10;
    int b = 90;
    
    public static void main(String[]args)
    {
    	Calculator calculator = new Calculator();
    	calculator.addition();
        calculator.subtraction();
        System.out.println("==========");
       Calculator calculator1=new Calculator();
       calculator1.addition();
       calculator1.subtraction();
       multiplication();
       division();
       
    }
	   public void addition()
	   {
		   int sum = a + b;
		   System.out.println("Addition is " + sum);
	   }
	    public void subtraction()
	   {
	    	int a = 10;
	        int b = 90;
	    	int sub = a - b;
	    	System.out.println("Subtraction is "+ sub);
	   }
 
	    public static void multiplication()
	    {
	    	int a = 10;
	    	int b = 90;
	    	int mul = a*b;
	    	System.out.println("multiplication is "+ mul);
	    	
	    }
	    
	    public static void division()
	    {
	    	int a = 10;
	    	int b = 90;
	    	float div=a/b;
	    	float rem=a%b;
	        System.out.println("division is "+div);
	    	System.out.println("remainder is "+rem);
	    	
	    	
	    	

	    	
	    	
	    }
	    
}
