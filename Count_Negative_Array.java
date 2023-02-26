import java.util.*;
class Count_Negative_Array{
      public static void main (String ...a){
              Scanner sc = new Scanner(System.in);
              System.out.print("enter the size of array:");
              int n = sc.nextInt();
              int arr[] = new int[n];
              for (int i=0; i<n; i++){
                  arr[i] = sc.nextInt();
              }
              for (int j=0;j<n;j++){
                System.out.print(arr[j] + " ");
              }
              int count=0;
              for (int k=0;k<n;k++){
                if(arr[k]<0){
                    count++;
                }
        
               }
              System.out.print("count:" + count);
      }

}