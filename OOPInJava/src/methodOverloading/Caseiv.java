package methodOverloading;

public class Caseiv {
	public void m1(int i) {
		System.out.println("General method");
	}
	public void m1(int... i) {
		System.out.println("Var-Arg method");
	}

	public static void main(String[] args) {
		Caseiv c = new Caseiv();
		c.m1();
		c.m1(10,20);
		c.m1(10);
		/*
		 * in case 3 the m1(int i) will get the chance as it is old concept
		 * in fight between old and new concept old concept will always get a chance
		 */

	}

}
