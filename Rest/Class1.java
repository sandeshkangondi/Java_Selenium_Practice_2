import java.util.Scanner;

public class Class1 {

	public static void main(String [] args){
		
		Class2 c2 = new Class2();
		Class2 c3 = new Class2("B");
		Class2 c4 = new Class2("A","B");
		c2.printName();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		c2.printNameonEntry(name);
		System.out.print("Enter your gf name: ");
		String gf = sc.nextLine();
		c2.setName(gf);
		System.out.println(c2.getName());
		c2.printgfName();
		System.out.println();
		System.out.println(c4.getName());
		c4.printgfNames();
		System.out.println();
		c3.printgfName();
		System.out.println();
		c3.printsecgfName();
		
		}
}
