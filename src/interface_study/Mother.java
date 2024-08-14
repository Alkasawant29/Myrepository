package interface_study;

public interface Mother 
{
  void look();
  default void love()
  {
	  System.out.println("Mother's love");
  }
      static void care()
  {
	  System.out.println("Mother's care");
  }
}
