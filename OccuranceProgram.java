 import java.util.*;
public class OccuranceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MOUMITA
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the string");
		String n = sc.nextLine();
		HashMap<Character, Integer> hmap = new HashMap<> (); //output order not fixed
		for(int i=0; i<n.length(); i++) {
			
			if(hmap.containsKey(n.charAt(i))) {
				
			int count =	hmap.get(n.charAt(i));
			hmap.put(n.charAt(i), count = count +1);
			}
			else
				hmap.put(n.charAt(i), 1);
			
		}
		System.out.println(hmap);
		

	}

}
