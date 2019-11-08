
public class Class3 {

	public static void main(String [] args){
		
		Class2 c2= new Class2();
		c2.setHour(12);
		c2.setMinute(3);
		c2.setSecond(23);
		
		System.out.println(c2.getHour()+":"+c2.getMinute()+":"+c2.getSecond());
		
		c2.printHello();
		
	}
}
