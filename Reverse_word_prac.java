import java.util.*;
public class Reverse_word_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word: ");
	
		String word = sc.nextLine();
		
			
			StringBuilder sb = new StringBuilder(word);
			StringBuilder reverse = sb.reverse();
			
			
		
		System.out.println(reverse.toString());

	}

}
