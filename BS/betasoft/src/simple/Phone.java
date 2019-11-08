package simple;

public class Phone {
int number = 1234;
static int number1 = 145;
String model = "General";
 
int getnumber(){
	return number;
}
void printing(){
	System.out.println("This is a phone");
}
void printing(int x, int y){
	int number = x;
	number1 = y;
	System.out.println("This is a phone with number: " + number);
	System.out.println("This is a phone with number1: " + number1);
}
}