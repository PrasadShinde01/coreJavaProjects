package methodOverloading;

public class CaseFive {

	public void m1(int i,float f) {
		System.out.println("int - float ");
	}
	public void m1(float f,int i) {
		System.out.println("float - int ");
	}
	
	public static void main(String[] args) {
		CaseFive f = new CaseFive();
		f.m1(10,10.5f);
		f.m1(10.5f, 10);
        //f.m1(10, 10);
        
	}

}
