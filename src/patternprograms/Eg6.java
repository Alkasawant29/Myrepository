package patternprograms;

public class Eg6 {

	public static void main(String[] args) {
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		int row=5;
		int star=5;
		int space=0;
		for(int i=5;i<=row;i++)
		{
			//for space
			for(int j=1;j<=space;j++)
			{
				System.out.print("");
			}
		
		  //for star
		for(int k=1;k<=star;k++)
		{
		  System.out.print("*");
		}
		System.out.println();
		space++;
		star--;
		
	}	
		
	}

}
