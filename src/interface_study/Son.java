package interface_study;

public class Son implements Mother,Father{

	public static void main(String[] args)
	{
		Son son=new Son();
		son.nature();
		son.look();
		son.love();
		System.out.println("================");
		//calling using interface reference
		
		Mother.care();
		Father.care();
	}

	@Override
	public void love() {
		Mother.super.love();
		Father.super.love();
	}

	@Override
	public void nature() 
	{
		System.out.println("Father's nature");
	}

	@Override
	public void look() 
	{
		System.out.println("Mother's look");
	}
	
	// java vsion before 8
	// java 8 onwards-->interface --> change
	// Interface we will support few methods with body--> complete method
	// default method along with body, static method along with body
}
