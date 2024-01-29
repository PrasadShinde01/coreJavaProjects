package classObjectsConstructors;

public class ConstructorCalling {

	public static void main(String[] args) {

        Name Shivam = new Name();
        System.out.println(Shivam.rollNo);

	}
	
}
class Name{
	int rollNo;
	String name;
	float marks;
	
	//this is how we call constructor from another constructor
	Name(){
	this(12,"Shivam",79.0f);
	}
	
	Name(int rno,String name,float marks){
		this.rollNo = rno;
		this.name = name;
		this.marks = marks;
	}
	
}

