package junit3;

import java.util.Scanner;

public class Calculator {
public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int fno = sc.nextInt();
		System.out.println("Enter the scond number");
		int sno = sc.nextInt();
		System.out.println("Enter +, -, * or /   ");
		String operation = sc.next();
CalciLib CL = new CalciLib(3);
CalciLib CL2 = new CalciLib("sand");
int z = CL.add(3,4);
if (operation.equals("+")){
System.out.println("Sum is "+ (fno+sno) );}
else if (operation.equals("-")){
System.out.println("Difference is "+ (fno-sno) );}
else if (operation.equals("*")){
System.out.println("Product is "+ (fno*sno));}
else if (operation.equals("+")){
System.out.println("Divide value is "+ (fno/sno));}
else {
	System.out.println("wrong value typed in for operation");
	
}
	
}
public int add(int a, int b){
	int c = a+b;
	return c;
}

public int subtract(int a, int b){
	int c = a-b;
	return c;
}

public int multiply(int a, int b){
	int c = a*b;
	return c;
}

public int divide(int a, int b){
	int c = a/b;
	return c;
}
}








