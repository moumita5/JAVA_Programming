 import java.util.*;
public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
          System.out.println("enter the number:");
         int n = sc.nextInt();
         int temp = n;
         int sum=0;
          ArmStrongNumber asn = new ArmStrongNumber();
             while(n!=0) {
        	int rem=n%10; // remainder
        	int result = asn.cube(rem); //calling the cube method
        	sum = sum + result; // the sum result 
        	n=n/10; //
        }   
             
             System.out.println(sum);
             
             if(temp == sum) {
            	 System.out.println("Armstrong Number");
             }
             else
            	System.out.println("not a Armstrong Number"); 
	}
	
	public int cube( int m)
	{
		return m*m*m;
			
	}		
		
}



