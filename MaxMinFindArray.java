
public class MaxMinFindArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {34,13,75, -2, 46, 7, 67,-22, 9};
		int min =0;
		int max=0;
	    
		for(int i=0;i<arr.length;i++) {
			
			if(min > arr[i]) {
				min=arr[i];
			}
			if(max < arr[i]) {
				max =arr[i];
			}
			
		}
			System.out.println(min);
			System.out.println(max);
			
			
		
	}

}
