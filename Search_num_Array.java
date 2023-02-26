import java.util.*;

class Search_num_Array{
      public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        for(int j=0;j<n;j++){
        System.out.print(arr[j] + " ");
      }
        System.out.println();
        int m=sc.nextInt();
        boolean temp= false;
       for (int k=0;k<n;k++){
               if (arr[k]==m){
               temp = true;
               break;
               }
       }
       if(temp==true)
       System.out.println("exist");
       else
       System.out.println("not exist");
      }}


