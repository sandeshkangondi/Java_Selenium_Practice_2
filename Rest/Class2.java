
public class Class2 {
	
	public String girlfriend, secgf;
	private int hour;
	private int minute;
	private int second;
	final int NUM =3;
	
	Class2(){
		
	}
	
	Class2(String name){
		girlfriend = name;
	}
	
	Class2(String name, String name2){
		girlfriend = name;
		secgf = name2;
	}
	
	void printName(){
		System.out.println("My name is Sandesh.");
	}
	
	void printNameonEntry(String name){
		System.out.println("My name as you entered is:" + name);
	}
	
	void setName(String name){
		girlfriend = name;
	}
	
	String getName(){
		return girlfriend;	
	}
	
	String getsecgfName(){
		return secgf;
	}
	
	void printgfName(){
		System.out.printf("You first gf was: %s", getName());
	}
	
	void printsecgfName(){
		System.out.printf("Your second gf is %s", getsecgfName());
	}
	
	void printgfNames(){
		System.out.printf("Your gfs were %s and %s", getName(), getsecgfName());
	}
	
	public void setHour(int hour){
		this.hour = hour;
	}
	
	public void setMinute(int minute){
	this.minute=minute;	
	}
	
	public void setSecond(int second){
		this.second=second;
	}
	
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second;
	}
	
	public String toString(){
		return ("hello");
	}
	
	public void printHello(){
		System.out.printf("%s", this);
	}
	
	}