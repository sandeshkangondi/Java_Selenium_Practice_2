package simple;

public class Calc {
public static void main(String args[]){
	Calc c = new Calc();
	System.out.println(c.add(2,3));
	System.out.println(c.add(2,3,5));	
}

int add(int a, int b){
	return(a+b);
}

int add(int a, int b, int c){
	return(a+b+c);
}
}