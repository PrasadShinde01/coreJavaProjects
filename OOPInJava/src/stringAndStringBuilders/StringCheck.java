package stringAndStringBuilders;

public class StringCheck {

	public static void main(String[] args) {
		String str = "amo";
		String mal = "amo";
		System.out.println(str == mal); //this will print true because both ref variables
		                                //pointing to the same object "amo"
		String check1 = new String("Amo");
		String check2 = new String("Amo");
		System.out.println(check1==check2);
		//this will print false because two different objects are created
		System.out.println(check1.equals(check2));
		
		System.out.println(check1.charAt(0));
		
		/*
		 * wrapper class =>
		 */
		Integer num = new Integer(10);  
		System.out.println(num.toString());
	}

}
