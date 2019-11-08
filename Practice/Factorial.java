package Practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String [] args){
		
		int num, fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num: ");
		num = sc.nextInt();
		for(int i=2;i<=num;i++)
			fact=fact*i;
	System.out.println(fact);
	}
}
