import java.util.Scanner;

public class Switch {
	
	public static void main(String [] args){

	int age;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter age: ");
	age = sc.nextInt();
	
	switch(age){
	
	case 1: System.out.println("You are too young");
	break;
	case 2: System.out.println("You have grown up");
	break;
	case 3: System.out.println("You can go to school");
	break;
	default: System.out.println("Wrong entry or you have been in school");
	break;
	
	}
	}	
}
