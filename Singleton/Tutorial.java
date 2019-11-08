package Singleton;

public class Tutorial {

	String name, teacher;
		
	public Tutorial(String name){
		this.name=name;
		School school = School.school;
		teacher=school.getTeacher();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public static void main(String [] args){
		for (int i=0;i<10;i++){
			Tutorial tutorial = new Tutorial("Singleton "+i);
			System.out.println(tutorial.getName()+" has "+ tutorial.getTeacher());
			
		}
		
	}
}
