package Methodstudy;

public class Studentsinfo {

	public static void main(String[] args) {
		
	    Studentsinfo info = new Studentsinfo();
	    info.displayInformation();
	    info.displayInformation("Test2",11,23,'C',90,true);
	    

	}
     
	public void displayInformation() 
	{ 
		//name,rollNum,age,div,%marks,result
		
		String name = "Shankar";
		int rollnum = 45;
		float age = 19.99f;
		char div = 'B';
		float marks = 88.80f;
		boolean result = true;
		
		
		System.out.println("=======================");
		System.out.println("Student's name is"+ name);
		System.out.println("Student's rollnum is"+ rollnum);
		System.out.println("Student's age is"+ age);
		System.out.println("Student's div is"+ div);
		System.out.println("Student's marks is"+ marks+"%");
		System.out.println("Student's result is"+ result);
		System.out.println("=========================");
		
	}
	
	//    String name="shankar";
	//    int rollNum=45;
	//    float age=19.9f;
	//    char div='B';
	//    float marks=88.80f;
	//    boolean result=true;
	
	  //methods with parameters/parameterized methods
	public void displayInformation(String name,int rollNum,float age,char div,float marks,boolean result)
	{
		
		System.out.println("====================================");
		System.out.println("Students name is"+name);
		System.out.println("Students rollNum is"+rollNum);
		System.out.println("Students age is "+age);
		System.out.println("Students div is"+div);
		System.out.println("Students marks is"+marks);
		System.out.println("Students result is"+result);
		System.out.println("========================================");
		
		
	}
	
	}
