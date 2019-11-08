package simple;
public class Myproj {
	static String type= "boy";
	@SuppressWarnings("unused")
	private int a;
public static void main(String args[]){
	String name = "America";
	System.out.println("Hello "+ name + " "+ type);
	Myproj mp = new Myproj();
	Myproj2 mp2 = new Myproj2();
	mp2.x=10;
	System.out.println(mp2.x);
	mp.mymethod1();
	mp.a=10;
		mymethod2();
		mp2.meth();
}// end of main

void mymethod1()
{
	int a = 0;
	System.out.println("Hi" + a);
}

static void mymethod2()
{
	System.out.println("Hello");
}
}// end of class