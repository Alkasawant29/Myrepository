package interface_study;

public interface Father
{
	void nature();
	default void love()
	{
		System.out.println("Father's love");
	}
	static void care()
	{
		System.out.println("Father's care");
	}

}
