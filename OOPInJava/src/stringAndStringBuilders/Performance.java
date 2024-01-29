package stringAndStringBuilders;

public class Performance {

	public static void main(String[] args) {
		
		String series = " ";
		for(int i=0;i<26;i++) {
			char pr = (char)('a'+i);
			series = series + pr;
			//System.out.print((char)('a'+i));
			
		}
		System.out.println(series);
	}

}
