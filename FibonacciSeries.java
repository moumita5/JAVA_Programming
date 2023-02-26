import java.util.ArrayList;
import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
	
		int n = sc.nextInt();
		int num1 = 0;
		int num2 = 1;
		
		ArrayList list = new ArrayList();
		 list.add(num1);
		 list.add(num2);
		 
		 for(int i =0;i<n-2;i++)
		 {
			int s = num1 + num2 ;
			list.add(s);
			
			num1 = num2;
			num2 = s;
			
		 }
		 
		 System.out.println(list);	
		
	}

}
