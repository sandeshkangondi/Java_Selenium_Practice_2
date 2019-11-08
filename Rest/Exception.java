import java.util.Scanner;

public class Exception {

public static void main(String args[]){
	int num1, num2, result;
	int x=1;
	Scanner sc = new Scanner(System.in);
	do{
	try{
	System.out.println("Enter first no: ");
	num1 = sc.nextInt();
	System.out.println("Enter second no: ");
	num2 = sc.nextInt();
	result=num1/num2;
	System.out.println("Result= "+result);
	 x=2;
	}
	catch(java.lang.Exception e){
		System.out.println("Something wrong with input values");
	}}while(x==1);
	
	
}

}
