package Singleton;

import java.util.ArrayList;

public class School {

	public final static School school = new School();
	ArrayList<String> teachers = new ArrayList<String>();
	
	public School(){
		teachers.add("Jack");
		teachers.add("Jill");
		teachers.add("Will");
		teachers.add("Bill");
		teachers.add("Mike");
		teachers.add("Robert");
	}
	
	public String getTeacher(){
		if(teachers.size()>0)
			return (teachers.remove(0));
		return "No Teachers";
		
	}
	
}
