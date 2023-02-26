import java.util.*;
public class Sen_Rev {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence: ");
		String value = sc.nextLine();
		String str = "";
		String[] sen = value.split("\\s");
		
		for(String res : sen) {
			
			StringBuilder sb = new StringBuilder(res);
			sb.reverse();
			str = str + sb.toString() + " ";
			
		}
		System.out.println(str);
		
	}

}*/


 public static void main(String args[]) {
            	  
            	  
            	  Scanner sc = new Scanner(System.in);
            	  System.out.println("enter the sentence: ");
            	  String sen = sc.nextLine();
            	  String str = "";
            	  String[] m = sen.split("\\s");
            	  for(String n : m) {
            		  
            		  StringBuilder sb = new StringBuilder(n);
            		  sb.reverse();
            		  str = str + sb.toString() + " ";
            		  
            	  }
            	  
            	  System.out.println(str);
              }
	
	
}
