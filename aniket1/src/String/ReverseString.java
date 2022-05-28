package String;

public class ReverseString {

	  public static void main(String[] args) {
		 
		  String original="abcdef";
		  String reverse="";
		  
		  System.out.println(original.length());
		  for(int i=original.length()-1;i>=0;i--) {
			  reverse=reverse+original.charAt(i);
		  }
		  System.out.println("The reverse String is "+" "+reverse);
		  
		  
	}
	
}
