

	public class Employee
	{
	private String name;
	private String address;
	private int SSN;
	private int number;
	public static int counter;
	public Employee(String name, String address, int SSN)
	{
	System.out.println("Constructing an Employee");
	this.name = name;
	this.address = address;
	this.SSN = SSN;
	this.number = ++counter;
	}
	public void mailCheck()
	{
	System.out.println("Mailing a check to " + name
	+ ", number " + number);
	}
	public static int getCounter()
	{
	System.out.println("Inside getCounter");
	return counter;
	}
	}
