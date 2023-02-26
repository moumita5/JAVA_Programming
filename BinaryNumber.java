import java.util.*;
public class BinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			    Scanner sc = new Scanner(System.in);
				System.out.println("enter the binary digit");
				
				int n =sc.nextInt();
				String str = "";
				 ArrayList<Integer> list = new ArrayList<>();
				
				while(n!=0){
				    
				    int r=n%2;
				    list.add(r);
				    str = str + r;
				    n= n/2;
				}
				
				Collections.reverse(list);
				System.out.println(list);
				System.out.println(str);
				
				
				StringBuilder sb = new StringBuilder(str);
				StringBuilder m = sb.reverse();
				
				
				System.out.println(m.toString());
			}
		

	}

