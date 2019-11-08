import java.util.Scanner;


public class Simpleaverage {

	public static void main(String [] args){
		int x, count=0, num, total=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers are you entering: ");
		x= sc.nextInt();
		System.out.println("Enter x numbers :");
		while(count<x){
			num=sc.nextInt();
			total=total+num;
			count++;
		}
		System.out.println("The average is: " + (total/x));
		
		
		
		
		
	}
	
	
	
}
