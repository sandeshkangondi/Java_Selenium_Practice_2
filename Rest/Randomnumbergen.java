import java.util.Random;

public class Randomnumbergen {

	public static void main(String [] args){
		
		Random ran = new Random();
		for (int i=0; i<10; i++){
			System.out.println(1+ran.nextInt(6));
		}	
	}
}