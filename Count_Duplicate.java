import java.util.*;
class Count_Duplicate{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the size of the array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
         arr[i] =sc.nextInt();
    }
    for(int j=0; j<n; j++){
        System.out.print(arr[j] + " ");
    }
    
    int temp = 0;
    int arr1[] = new int[n];
    for(int k=0;k<n;k++){
        temp = arr[k];
        int count = 0;
        for(int y=0;y<n;y++){
            if(temp == arr[y]){
                count++;
            }
        }
         arr1[k] = count;
        }
        System.out.println();
     for(int x=0;x<n;x++){
        System.out.print(arr1[x] + " ");
     }

    }
}

