
public class staticdemo {
	public static void main(String [] args)
	{
	Employee.counter = 100;
	System.out.println("Counter = " + Employee.getCounter());
	Employee e = new Employee("John Wayne",
	"101 Hollywood Blvd.", 123456789);
	System.out.println("Counter now = " + Employee.getCounter());
	System.out.println("Using e: "+ e.getCounter());
	}
}
