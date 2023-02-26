import java.util.*;
public class DuplicateElement {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the size of the array:");
     int n = sc.nextInt();
     int arr[] = new int[n];
      for(int i = 0 ; i<n;i++) {
    	  
    	  arr[i] = sc.nextInt();
      }
      System.out.println();
      for(int j =0;j<n;j++) {
    	  
    	  System.out.print(arr[j]+ " ");
      }
      
      System.out.println();
      
      ArrayList list = new ArrayList();
      ArrayList list1 = new ArrayList();
		
      for(int x=0;x<n;x++) {
    	  int count = 0 ;
    	  for(int y=0;y<n;y++) {
    		  if(arr[x]==arr[y]) {
    			  
    			  count++;
    		  }
    		 	  
    	  }
    	  
    	  if(count==2) {
    		  if(!list.contains(arr[x])) {
    		  list.add(arr[x]);
    		  }
    	  }
    	  else {
    		  list1.add(arr[x]);
    	  }
    	  
      }
		System.out.println(list);		
		System.out.println(list1);
		
	}
  
}
