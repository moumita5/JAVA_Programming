import java.util.*;
public class StringReverseWord {

	public static void main(String[] args) {
	
            Scanner sc =new Scanner(System.in);
            System.out.println("enter the string");
            String n = sc.nextLine();
          
            String str = "";
            
		    for (int i = 0;i<n.length();i++) {
		    	
		    	str =  n.charAt(i) + str ;
		    	   	
		    }
		    //string equality comparison we have to use ".equals" method not "=="
		    if(n.equals(str)) {
		    	
		    	System.out.println("string pallindrome");
		    }
		    else
		    	System.out.println("not string pallindrome");
		
		    System.out.println(str);
		
	}

}
