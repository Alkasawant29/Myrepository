package patternprograms;

public class Eg3 {

	public static void main(String[] args) {
		//*****
		//*****
		//*****
		
		// row-->3 columns-->5
		// think about row 1st-->outer for loop rows
		// inner for loop--->for columns
		
		int row=3;
		int column=5;
		for(int i=1;i<=row;i++)//---->fpr outer loop row
		{
			for(int j=1;j<=column;j++)//---->for inner loop column
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
