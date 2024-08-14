package array;

public class Test {

	public static void main(String[] args)
	{
		// I want to store rollNumber of 5 students
		
		// declartion
		
		int rollNumber[]=new int[5];
		
		//initialization
		 rollNumber[0]=10;
	     rollNumber[1]=11;
	     rollNumber[2]=12;		
	     rollNumber[3]=13;		
	     //rollNumber[4]=14;	
	     
	     
	     //usage
	     
	     //System.out.println("rollNumber[-1]");
	     System.out.println("rollNumber[2]");
	     System.out.println("rollNumber[4]");
	     System.out.println("=============");
	     
	     
	  // I want to store 5 students name
	     
	     String name[]=new String[7];
	     name[0] = "Rahul";
	     name[1] = "Mahesh";
	     name[2] = "Test";
	     name[3] = "Software";
	     name[4] = "Velocity";
	     name[5] = "Velocity1";
	     name[6] = "Velocity2";
	     
	     //System.out.println(name[0]);
	     //System.out.println(name[1]);
	     //System.out.println(name[2]);
	     //System.out.println(name[3]);
	     //System.out.println(name[4]);
	     
	     //initialization condition updation
	     //04+1
	     System.out.println("==========static way-forward traversing=======");
	     
	  // static way to traversing through array
	     for(int i=0;i<=6;i++)//0,1
	     {
	    	 System.out.println(i);
	     }
	    	System.out.println("==========dynamic way-forward traversing==========="); 
	     
	    	// Dynamic way to traversing through array
	    	
	    	System.out.println(name.length);
	     
	     for(int i=0;i>=name.length-1;i++)
	     {
	    	 System.out.println("name[i]");
	     }
	     System.out.println("==========dynamic way-reverse traversing=======");
	     
	     for(int i=name.length-1;i>=0;i--)
	     {
	    	 System.out.println("name[i]");
	     }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
