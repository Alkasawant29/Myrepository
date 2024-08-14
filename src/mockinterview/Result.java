package mockinterview;

public class Result extends Marks
{
    int total;
    
	public static void main(String[] args) 
	{
		Student student=new Student();
		student.setstudentInfo(29, "Alka");
		student.getStudentInfo();
		
		Marks marks=new Marks();
		marks.setMarks(60, 70);
		marks.getMarks();
		
		Result result=new Result();
		result.setMarks(60, 70);
		result.calculate();
		result.getResult();
		
	}
    public void calculate()
    {
    	total=marks1+marks2;
    }
    
    public void getResult()
    {
    	System.out.println("Total marks of student is "+total);
    }
   
}
