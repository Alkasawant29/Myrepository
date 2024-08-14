package loops;

public class For_loop {

	public static void main(String[] args) {
			
		// I want to print table of 3
		// 3,6,9,12,15,.....30
		// initialization-->3
		// condition-->30
		// updation--> incremental i+3
		
		for(int i=3;i<=30;i=i+3)
		{
			System.out.println(i);//3,6,9,12,15,...
		}
		System.out.println("Table of 3");
		
		// I want to print table of 3 in reverse order
		// 30,27,......6,3
		// initialization-->30
		// condition-->3
		// updation-->decremental i-3
		for(int i=30;i>=3;i=i-3)
		{
			System.out.println(i);
		}
		System.out.println("reverse table of 3");
		
		// I want to print Pune 5 times
		// initialization-->1
		// condition-->5
		// updation-->incremental ++
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("pune");
		}
	}

}
