import java.util.*;
class Reverse_Array{
    public static void main (String ...a){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();            
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+ " ");
        }
        int array[] = new int[n];
        int temp = n;
        for(int k=0;k<n;k++){           
            array[temp-1]=arr[k];
              temp --;
            
        }
        System.out.println();
        for(int m=0; m<n; m++){
            System.out.print(array[m] + " ");
        }

    }
}