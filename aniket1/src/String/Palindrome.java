package String;

public class Palindrome {

	public static void main(String[] args) {

		String original="abcba";
		String reverse="";
		
		for(int i=original.length()-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
	}

}
