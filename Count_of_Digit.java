import java.util.*;
public class Count_of_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = sc.nextInt();
		int count = 0;
		while(n!=0) {
			n = n/10;
			count ++;		
		}
		System.out.println("print the no of digit: " + count);		
		
		
	}

}
