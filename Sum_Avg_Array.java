
import java.util.*;
class Sum_Avg_Array{
      public static void main (String args[]){

        int arr[]={2,2,4,5};
        int sum = 0;
        double avg = 0;
        for (int i=0;i<4;i++){
            sum = arr[i]+ sum;
            
        }
        System.out.println("Result:" + sum);
        avg = ((double)sum/ 4); //typecasting --> upcasting

        System.out.println("Result:" + avg);

      }

}