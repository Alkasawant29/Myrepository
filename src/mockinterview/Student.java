package mockinterview;

public class Student 
{
  int rollno;
  String name;
  
  public static void main(String[] args)
  {
	Student s=new Student();
	s.setstudentInfo(29,"Alka");
	s.getStudentInfo();
 }
  
  public void setstudentInfo(int sRollno,String sName)
  {
	rollno=sRollno;
	 name=sName;
  }
  
  public void getStudentInfo()
  {
	  System.out.println("Student rollno is "+rollno);
	  System.out.println("Student name is "+name);
  }
}
