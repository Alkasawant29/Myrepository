package variableTypes;       //assign global variable using object

public class Employee 
{
   String empName;
   int empId;
   char empGender;
   float empSalary;
   static String country="India";
   
   
    public void empInfo()
    {
    	System.out.println("Employee name is"+ empName);
    	System.out.println("Employee empId is"+ empId);
    	System.out.println("Employee empGender is"+ empGender);
    	System.out.println("Employee empsalary is"+ empSalary);
    	System.out.println("Employee country is"+ country);
    	
    	System.out.println("========================");
    }
	 
		
	
}
