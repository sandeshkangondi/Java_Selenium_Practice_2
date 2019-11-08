import java.util.Random;


public class tests {
	 public static void main(String [] args)
	 {
	 String t="";
	 //for(int i=0; i < 10; i++)
	 t += Math.abs((new Random()).nextInt((int) Math.pow(10,10)));
	 System.out.println(t);	 }
}
