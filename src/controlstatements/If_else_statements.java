package controlstatements;

public class If_else_statements {

	public static void main(String[] args) 
	{
		//if marks are 40 then you are pass
		//else you are fail
//    if(condition)
//		{
//			statement to be executed
//		}
//		else
//      {
//		    another statement
//	    }
        
		int marks=40;
		if(marks>40)
		{
			System.out.println("you are pass");
		}
		else
		{
			System.out.println("you are fail");
		}
	
	//if signal is red then stop
	//else go
	String signal="red";
	if(signal=="red")
	{
		System.out.println("stop");
	}
	else
	{
		System.out.println("go");
	}
	
	//if you are male then turn right
	//else turn left
	
	char gender='M';
    if(gender=='M')
	{
		System.out.println("turn right");
	}
	else
	{
		System.out.println("turn left");
	}
}
}
