import java.util.Scanner;

public class While {

	public static void main(String [] args){
		
		int x, count=0, numbers=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number upto which you need to print: ");
		x=sc.nextInt();
		while(count<x){
			System.out.println(count++);
		}	
		do{
			System.out.println(numbers++);
		} while(numbers<x);
		
	}
}
