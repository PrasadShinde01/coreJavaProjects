package constructors;

public class ConsOverl {
	public static void main(String[] args) {
		//Testt t1 = new Testt(10.33);
		//Testt t2 = new Testt(10);
		//Testt t3 = new Testt();
	}
	
}
class Testt{
	
	Testt(double d){
		//this(10);
		System.out.println("Double-Arg constructor");
	}
	Testt(int d){
		//this();
		System.out.println("int-Arg constructor");
	}
	Testt(){
		
		System.out.println("no-Arg constructor");
	}
	public static void main(String[] args) {
		Testt t1 = new Testt(10.33);
		//Testt t2 = new Testt(10);
		//Testt t3 = new Testt();
	}
	
	
}