import java.util.Scanner;

public class Sentence_Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter the string sentences: ");
          String sen = sc.nextLine();
          //for split from space in sentences
           String str = "";
          String[] n = sen.split("\\s");
          for(String m: n ) {
        	  
        	  
        	  StringBuilder sb = new StringBuilder(m);
        	  sb.reverse();
        	  str = str + sb.toString() + " ";
        	  
        	  
          }
          System.out.println(str);
          
		
		
	}

}
  