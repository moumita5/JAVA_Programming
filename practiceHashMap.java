import java.util.*;
public class practiceHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MOUMITA
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		HashMap<Character, Integer> hmap = new HashMap<> ();//hashmap doesnot maintained order
		for(int i =0;i<str.length();i++) {
			
			if(hmap.containsKey(str.charAt(i))) 
			{
				int count = hmap.get(str.charAt(i));
				hmap.put(str.charAt(i),count=count+1);
				
			}
			
			else {
				hmap.put(str.charAt(i), 1);
			}
					
		}
		
		System.out.println(hmap);

	}

}
