package inheritance;

public class Multilevelinheritence {

	public static void main(String[] args) {
		Laxmibai laxmibai=new Laxmibai();
		laxmibai.singing();
        Laxmibai.stories(); // static method
        
        Kranti kranti=new Kranti();
        kranti.look();
        kranti.recipe();
        kranti.singing();//grandmother non static method using mothers ref.
        
        Kranti.nature();//static method
        Kranti.stories();//grandmother static metod called using mothers ref.
                
        Alka alka=new Alka();
        alka.hobbies();
        alka.look();
        alka.singing();
        alka.study();
        alka.recipe();
        
        Alka.nature();
        Alka.stories();

        
	}

}
