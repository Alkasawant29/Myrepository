package Methodstudy;

public class Mathsoperation {

	public static void main(String[] args) {
		Mathsoperation mo=new Mathsoperation();
		mo.addition();  //calling method without parameters
		mo.addition(11,22); //calling method with parameters
		mo.addition(1,2);
		subtraction();
		division();
		

	}
     public void addition()   //methods without parameters
     {
    	int a = 10;
    	int b = 20;
    	int sum = a+b;
    	System.out.println("addition is"+sum);
     }
     
     public void addition(int a,int b)  //method with parameters
     {
    	 int sum = a+b;
    	 System.out.println("addition is"+sum);
     }
     public static void subtraction() 
     {
    	int x=99;
    	int y=90;
    	int sub=x-y;
    	System.out.println("subtraction is"+sub);
    	
     }
     public static void division()
     {
    	 int x=99;
     	int y=90;
     	int div=x/y;
     	System.out.println("division is"+div);
    	 
    	 
     }
     
}
