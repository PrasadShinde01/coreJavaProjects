package methodOverloading;

/*
 * Automatic Promotion in overloading
 */

public class Casei {
	static void m1(int i) {
		System.out.println("int version");
	}
	static void m1(float f) {
		System.out.println("float version");
	}

	public static void main(String[] args) {
		Casei c = new Casei();
		c.m1(10);
		c.m1('a');
		c.m1(10.23f);
		c.m1(1233l);
	//	c.m1(12.223); //CE: no suitable method m1(double)

	}

}
