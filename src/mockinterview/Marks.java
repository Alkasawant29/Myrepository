package mockinterview;

public class Marks extends Student
{
	public int marks1;
	public int marks2;

	public static void main(String[] args) 
	{
	   	Marks m=new Marks();
	   	m.setMarks(60,70);
	   	m.getMarks();

	}
  public void setMarks(int m1,int m2)
  {
	  marks1=m1;
	  marks2=m2;
  }
  
  public void getMarks()
  {
	  System.out.println("Marks1 is "+marks1);
	  System.out.println("Marks2 is "+marks2);
  }
}
