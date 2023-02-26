 import java.util.*;
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
          System.out.println("enter the number:");
         int n = sc.nextInt();
         int temp = n;
         int sum=0;
          StrongNumber asn = new StrongNumber();
             while(n!=0) {
        	int rem=n%10; // remainder
        	int result = asn.factorial(rem); //calling the factorial method
        	sum = sum + result; // the sum result 
        	n=n/10; //
        }   
             
             System.out.println(sum);
             
             if(temp == sum)
             {
            	 System.out.println("krishnamurty/strong number");
             }
             else
            	 System.out.println("not a strong number");
	}
	
	public int factorial( int m)
	{
		int fact =1;
		 while(m!=0)
		{
			fact = fact * m;
			m=m-1;
		}
		return fact;
	
	}		
		
}



