import java.util.Scanner;


public class Helloworld {
	public static void main(String[] args){
		System.out.println("Hello World");
		
		double x=1.23;
		float y,z,sum,answer;
		int tuna = 43, fish = 8, a = 3, b = 6;
		String name;
		
		System.out.println("Hi, I want " + x + " dollars");
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextLine());
		System.out.println("What is your name");
		name = sc.nextLine();
		System.out.println(name);
		System.out.println("Enter the first number y:");
		y = sc.nextFloat();
		System.out.println("Enter the second number z:");
		z= sc.nextFloat();
		sum = y+z;
		System.out.println("Sum = " + sum );
		System.out.println("Difference = " +(y-z));
		System.out.println("Product = " + (y*z));
		System.out.println("Modulus = " + (y%z));
		System.out.println("Divide = " + (y/z));
		
		
		System.out.println(tuna++);
		System.out.println(tuna);
		System.out.println(++tuna);
		
		System.out.println(fish--);
		System.out.println(fish);
		System.out.println(--fish);
		
		System.out.println(a+=3);
		System.out.println(a-=8);
		System.out.println(b*=3);
	}
	}

