package classObjectsConstructors;

public class ThisKeyword {
	public static void main(String [] args) {
		Student [] students = new Student[5];
		
		Student asad = new Student();
		System.out.println(asad.rollNo);
		asad.greeting();
		Student rasad = new Student(12,"rasad",74.4f);
		Student sasad = new Student(13,"rasad",74.4f);
		Student dasad = new Student(14,"rasad",74.4f);
		Student fasad = new Student(15,"rasad",74.4f);
		Student gasad = new Student(16,"rasad",74.4f);
		Student hasad = new Student(17,"rasad",74.4f);
		System.out.println(rasad.rollNo);
		System.out.println(sasad.rollNo);
		System.out.println(dasad.rollNo);
		System.out.println(fasad.rollNo);
		System.out.println(gasad.rollNo);
		System.out.println(hasad.rollNo);
		
	
		
	} 
	
	
	//create a class for every single student
	
	}
class Student{
	int rollNo;
	String name;
	float marks;
	
	 void greeting() {
		System.out.println("Hello! my name is " + this.name);
	}
	Student(){
	this.rollNo = 1;
	this.name = "Prasad";
	this.marks = 9.14f;
	}
	
	Student(int rno,String name,float marks){
		this.rollNo = rno;
		this.name = name;
		this.marks = marks;
	}
	
}
