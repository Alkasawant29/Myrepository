package inheritance;

public class Singlelevelinheritance {

	public static void main(String[] args) {
		
		Mother mother=new Mother();
		Daughter daughter =new Daughter();
		
		mother.recipe();
		mother.look();
		
		
	    daughter.study();
	    daughter.hobbies();
	    daughter.recipe();
	    daughter.look();
		

	}

}
