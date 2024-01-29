package methodOverloading;

public class Caseiii {
	static void m1(String s) {
		System.out.println("String version");
	}
	static void m1(StringBuffer sb) {
		System.out.println("StringBuffer version");
	}

	public static void main(String[] args) {
		Caseiii c = new Caseiii();
		c.m1("Durga");
		c.m1(new StringBuffer("Durga"));
	//	c.m1(null);  //3
		//for case 3 both method will get matched so we will get CE
		//reference to m1 is ambiguous / both methods got matched
	/*
	 * in overloading the highest priority will be given to exact matched method
	 */

	}

}
