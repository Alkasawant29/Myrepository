package loops;

public class while_loop {

	public static void main(String[] args) {
		// I want print "2" 10 times
		// initialization-->1
		// condition-->10
		// updation--> incremental ++

		int i=1;// initialization
		while(i<=10)//condition//1,2,3,9,10,11
		{
		System.out.println(2);//2,2,2....2,2
		i++;//updation 1,2,3..9,10,11
		}
		System.out.println("=================");		
		
         
      // I want to print table of 3
         int z=3;//initialization
         while(z<=30)//condition
         {
        	 System.out.println(z);
        	 z=z+3;//updation
         }
         System.out.println("table of 3");
         
      // I want to print table of 3 in reverse order
         
         int m=30;
         while(m>=3)
         {
        	 System.out.println(m);
        	 m=m-3;
         }
         System.out.println("reverse table of 3");
         
      // I want to print Pune 5 times
         
         int s=1;
         while(s<=5)
         {
        	 System.out.println("pune");
         }
         
	}

}
