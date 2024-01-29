package methodOverloading;

public class Caseii {
	static void m1(Object o) {
		System.out.println("object version");
	}
	static void m1(String s) {
		System.out.println("String version");
	}

	public static void main(String[] args) {
		Caseii c = new Caseii();
		c.m1(new Object());
		c.m1("Durga");
		c.m1(null);
		/*
		 * exaxt match will get highest priority
		 * if parent and child both method got matched the child argument will 
		 * always get priority
		 *when child argument is not matched then only parent argument will get chance
		 */

	}

}
