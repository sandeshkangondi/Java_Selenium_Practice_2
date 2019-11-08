import java.util.Scanner;

public class Ifelse {

	public static void main(String [] args){
		
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		x=sc.nextInt();
		System.out.println("Enter the value of y:");
		y=sc.nextInt();
		if(x!=10 && x>10){
			System.out.println("x is not 10 but greater than 10");
		}
		else if (x==10 || x==9){
			System.out.println("x is 10 or 9");
		}
		
		else{
			if(x==8){
				System.out.println("x is 8");
			}
			else{
			System.out.println("x is neither 10, 9 or 8 but lesser than 8");
		}
		}
		
		System.out.println(x>y? "x is greater than y":"x is not greater than y");
		
		
	}	
}