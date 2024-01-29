package methodOverloading;

public class Case6 {

}
class Animal{
	
}
class Monkey extends Animal{
	
}
class Test{
	public void m1(Animal a) {
		System.out.println("Animal version");
	}
	public void m1(Monkey m) {
		System.out.println("Monkey version");
	}
	public static void main(String[] args) {
		Test t = new Test();
		Animal a = new Animal();
		t.m1(a);    //Animal referance and Animal object
	    Monkey m = new Monkey();
		t.m1(m);
		
		Animal A = new Monkey(); //here the object reference is Animal so Animal
		//Class will get the Chance
		t.m1(A);
		
		
		/*
		 * in method overloading method resolution is always based on reference type 
		 * but not based on object
		 * # in overloading method resolution is always takes place by compiler
		 *  based on reference type 
		 */
	}
	
}
