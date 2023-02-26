import java.util.*;
public class ReplaceDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
        String n = sc.nextLine();
        
        String str = "";
        
        char ch = 'P';
       
        for(int i =0;i<n.length();i++) {
        	 int count = 0;
        	for(int j=0;j<n.length();j++) {
        		
        		if(n.charAt(i) == n.charAt(j)) {
        			count++;
        		}

        	}
        	
        	if(count == 2) {
        		
        		str = str + ch;
        	}
        	
        	else {
        		
        		str = str + n.charAt(i);
        	}
        	
        }
		System.out.println(str);
		
		
		
		
		
		
		
		
		
	}}