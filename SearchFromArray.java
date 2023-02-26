import java.util.*;
public class SearchFromArray{
{
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the size of the array");
	    //int arr[] = {3,6,1,4,2,6,3,5};
         int n =sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("enter the element of the array");
        for(int m=0;m<n;m++){
            
            arr[m] = sc.nextInt();
            
        }
        for (int z=0;z<n;z++){
            System.out.print(arr[z] + " ");
        }
        
        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList();
        
        
        for(int i = 0;i<n;i++){
        
            for(int j =0;j<n;j++){
                
                if(arr[i]+arr[j] == 5 )
                {
                   list.add(arr[i]);
                   list.add(arr[j]);
                   
                    
                }
            }list1.add(list);
            
        }
           System.out.print(list1);
           
            
        }

     
       //  for (int k =0;k<n;k++){
          //  System.out.println(arr[k] + " ");

}
}

