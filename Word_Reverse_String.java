import java.util.*;
public class Word_Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String originalString = sc.nextLine();
		String ReverseString = "";
		
		for(int i=originalString.length()-1;i>=0; i--) {
			
			ReverseString = ReverseString +originalString.charAt(i)  ;
		}
		 
		System.out.println(ReverseString);	
		
		
		if(originalString.equals(ReverseString)) {
			System.out.println("string pallindrome");
		}
		else
			System.out.println("not string pallindrome");
			

	}

}
