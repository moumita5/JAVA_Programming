
public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Sangeeta";
		String str1 = "";
		
	
			
		for(int i=0;i<str.length();i++) {
			
			int count =0;
			for(int j=0;j<str.length();j++) {
			if(str.charAt(i) == str.charAt(j)) {
				count++;
			}	
			
			}
			
			if(count == 2) {
				
				if(!str1.contains(Character.toString(str.charAt(i)))) {
					
					str1 = str1 + str.charAt(i);
				}
				
			} 
			else {
				str1 = str1 + str.charAt(i);
			}
			
		}
		
		System.out.println(str1);
			
			
			
			
			
		}		
		

	}


