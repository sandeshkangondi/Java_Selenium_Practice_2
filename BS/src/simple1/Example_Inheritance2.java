package simple1;

import simple.Example_Inheritance;

public class Example_Inheritance2  extends Example_Inheritance{
	public static void main(String args[]){
		
		Example_Inheritance2 EI = new Example_Inheritance2();
		
		int x = EI.gettype();
		String y = EI.getname();
		System.out.println(x);
		System.out.println(y);
		System.out.println(EI.name);
		System.out.println(EI.type);
		
}
}
