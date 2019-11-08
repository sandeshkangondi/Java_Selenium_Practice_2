package simple;

public class Testphone {
public static void main(String args[]){
	Iphone IP = new Iphone();
	IP.printing();
	Phone P = new Phone();
	P.printing();
	P.printing(12,14);
	System.out.println(P.number);
	System.out.println(Phone.number1);
}
}
