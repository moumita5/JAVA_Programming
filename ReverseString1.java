
/* public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "my name is MOUMITA";
		String String = "";
		
		
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			String = String + sb.toString() + " ";
		
		System.out.println(String);		
	}

}*/




public class ReverseString1 {

	public static void main (String args[]) {
		
		String word = "MOUMITA";
		
		StringBuilder sb = new StringBuilder(word);
		StringBuilder str = sb.reverse();
		
		System.out.println(str.toString());
		
		
	}
		
}



















