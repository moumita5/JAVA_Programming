
import java.util.*;
public class PrimeNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the prime range");
       int StartPoint = sc.nextInt();
       int EndPoint = sc.nextInt();
       String str = "";
       for(int i=StartPoint;i<=EndPoint;i++) {
    	   int count =0;
    	   for(int j=1;j<=i;j++) {
    		   
    		   if(i%j==0) {
    			  count++;
    		   }
    		   
    	   }
    	   if(count==2) {
    		   
    		   str=str+i+" ";
			   
		   }
    	   
    	   
       }
		
		
       System.out.println(str);	
		
	}

}
