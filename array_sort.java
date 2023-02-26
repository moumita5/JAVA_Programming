   import java.util.*;

public class array_sort{

    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the size of array: ");
         int n = sc.nextInt();
         int arr[] = new int[n];
         System.out.println("enter the array element: ");
         for(int i =0;i<n;i++){
                arr[i] = sc.nextInt();
                
         }
         System.out.println("Before sorting: ");
         for(int m=0;m<n;m++){
             System.out.print(arr[m]+ " ");

         }
         int temp =0;
         for(int x=0;x<arr.length-1;x++) {
        	 
        	
        	 for(int y=0; y<arr.length-x-1;y++) {
        		 
        		 
        		 if(arr[y] < arr[y+1]){
        			 //accending ">" greater than & decending "<" less than
        		 
        		 temp = arr[y+1];
        		 arr[y+1]=arr[y];
        		 arr[y]=temp;
        		 }}
         }
         System.out.println("\nAfter sorting: ");
        for(int k=0;k<n;k++) { 
         System.out.print(arr[k]+ " ");
        }
    }
}
