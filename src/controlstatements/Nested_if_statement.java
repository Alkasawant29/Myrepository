package controlstatements;

public class Nested_if_statement {

	public static void main(String[] args) {
		// enter your email id
		//if email id is correct then enter password
		//if password is correct then login success
		//else password is incorrect
		//else email id is incorrect
		String emailid="java@gmail.com";
		String password="java1234";
		if(emailid=="java@gmail.com")
		{
			System.out.println("Email id is correct,please enter password");
        if(password=="java1234")
        {
        	System.out.println("Password is correct,login success");
        }
        else
        {
        	System.out.println("incorrect password");
        }
		}
	    else
	    {
		    System.out.println("email id is incorrect");
	    }
}
}