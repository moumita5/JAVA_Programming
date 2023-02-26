import java.util.*;
public class array_sort_prac {
          public static void main(String args[]) {
        	  Scanner sc = new Scanner(System.in);
        	  System.out.println("enter the size of the array: ");
        	  int n = sc.nextInt();
              int arr[] =  new int[n];
              
              for(int i=0;i<n;i++){
            	  
            	  arr[i] = sc.nextInt();            
            	  }
              System.out.println("enter the array: ");
              for(int j=0; j<n;j++) {
            	  System.out.print(arr[j]+ " ");
              }
               System.out.println("\nBefore sort: ");
              int temp=0;
              for(int x=0;x<arr.length -1;x++) {
            	  for(int y=0;y<arr.length - x-1; y++) {
            		  if(arr[y] > arr[y+1]) {
            			  temp =arr[y+1];
            			  arr[y+1]=arr[y];
            			  arr[y]=temp;
             		  }
            	  }
              }
              
              for(int k =0;k<n;k++) {
            	  
            	  System.out.print(arr[k] + " ");
              }
              
              
              
          }
	
	
	
}
