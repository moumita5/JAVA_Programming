import java.util.*;
public class ArrayFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number for factorial: ");
        int m = sc.nextInt();
	    int fact =1;
		// factorial of the number 
		while(m!=0) {
			fact = m * fact; //fact = 1 * m value suppose 5 then fact = 5 then fact = 5 *4 means m=4 and fact is 5
			m= m-1;// m=5 then count becomes 5-1 = 4 m=4 then loop control goes to while 
				}	
		System.out.println("Factorial :"+ fact);
		
		
	}

}
