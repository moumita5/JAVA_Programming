import java.util.*;
public class StrongNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the range");
       int startpoint = sc.nextInt();
       int endpoint =sc.nextInt();
      ArrayList<Integer> list = new ArrayList<>();
       StrongNumberRange snr = new StrongNumberRange();
       for(int i=startpoint; i<=endpoint; i++) { 
    	   int sum=0;
    	   int temp = i;
    	   
    	   while(temp!=0) {
    		   int rem = temp%10;
    		   int result = snr.cube(rem);
    		   sum = sum + result;
    		   temp = temp /10;		   
    	   }
    	   
    	   if (sum == i) {
    		   list.add(i);
    		   
    	   }
    	    	   
       }   
       System.out.println(list);
       
	}
	// strong number
	public int factorial(int m) {
		
	int fact =1;
	while(m!=0) {	
		fact = fact * m;
		 m = m-1;
	}
	return fact;
		
	}
	//armstrong number
	public int cube(int x) {
		//int y = x*x*x;
	   // return y; //space complexity more
		
		return x*x*x;
	}
}
