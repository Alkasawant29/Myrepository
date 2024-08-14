package controlstatements;

public class If_Statement {

	public static void main(String[] args)
	{
		//if marks are greater than 40 then you are passs
		//data type + variable
		
		int marks=90;
		
		//if(condition)//marks>40
		{
			//statement to be executed
		}
        if(marks>40)//true
        {
        	System.out.println("you are pass");
        }
        
        // if signal is red then stop
        String signal="red";
        if(signal=="red");//false-->true
        {
        System.out.println("stop");
        }

	
	
	//if you are M/F then turn right
	char gender= 'M';
	if(gender=='M');//false-->true
	{
	System.out.println(" turn right");
    }

}
}
