import java.util.*;
class Cube_array{
       public static void main(String args[]){
               Scanner sc = new Scanner(System.in);
               System.out.print("enter the size of the array");
               int n =sc.nextInt();
               
               int arr[] = new int[n];
               for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
               }
               System.out.print("Print the Array: ");
               for(int j=0;j<n;j++){
                
                System.out.print(arr[j] + " ");
               }
               int arr1[] = new int[n];
               System.out.println("\nCube of Array ");
               for(int k=0;k<n;k++){
                arr1[k] = arr[k] * arr[k] * arr[k]; 
               }
                for(int y=0;y<n;y++){
                 System.out.print(arr1[y] + " "); 
                }
       }

}