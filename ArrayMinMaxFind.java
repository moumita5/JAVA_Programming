import java.util.*;
public class ArrayMinMaxFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i =0;i<arr.length;i++) {
			
			arr[i] =sc.nextInt();
		}
		
		for(int j =0;j<arr.length;j++) {
			
			System.out.println(arr[j]);
		}

		for(int k=0;k<arr.length - 1;k++) {
			
			int temp = 0;
			for(int y =0;y<arr.length - k -1;y++) {
			if(arr[y] > arr[y+1]) {
				
				temp = arr[y+1];
				arr[y+1] = arr[y];
				arr[y] = temp;
			}
			}
			}
		for(int x=0;x<arr.length;x++) {
			System.out.print(arr[x] + " ");
			
		}	
		System.out.println("\nminimumValue" + " " + arr[0]);
		System.out.println("maximumValue" + " " + arr[n-1]);
		
		}		
				
		
		
	}


