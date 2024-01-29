package constructors;

class Par {
    String s = "Parent class";
}
class Child extends Par{
	String s = "Child class";
	public void m1() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
	}
}
class Testing{
	public static void main(String [] args) {
		Child c = new Child();
		c.m1();
	}
}
