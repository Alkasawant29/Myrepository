package controlstatements;

public class Else_if_statement {

	public static void main(String[] args) 
	{
      //>=60-->first class
     //>=50-->second class
	//>=40-->just pass
	//<40-->fail
		
	//if marks greater than equal 60 then you are first class
	//else if marks greater than equal 50 then you are second class
	//else if marks greater than 40 then you are just pass
	//else if marks less than 40 then you are fail
		
		int marks=17;
		if(marks>=60)
		{
			System.out.println("you are first class");
		}
		else if(marks>=50)
		{
			System.out.println("you are second class");  
		}
		else if(marks>=40)
		{
			System.out.println("you are just pass");
		}
		else
		{
			System.out.println("you are fail");
		}
		
	
// if signal is red then stop 
//else if signal is yellow then slow down
//else signal is green then go

	String signal="yellow";
	if(signal=="red")
	{
		System.out.println("stop");
	}
	else if(signal=="yellow")
	{
		System.out.println("slow down");
	}
	else if(signal=="green")
	{
		System.out.println("go");
	}
	else
	{
		System.out.println("their is no signal available");
	}
}
	
}


