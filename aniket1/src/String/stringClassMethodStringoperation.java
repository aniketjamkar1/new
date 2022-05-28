package String;

public class stringClassMethodStringoperation {

	public static void main(String[] args) {
		
		String s="Velocity";
		String s1="velociity";
		String s2="   Welcome to home  ";
		System.out.println("====calculate the length====");
		
		System.out.println("The length is "+s.length());
		
		System.out.println("===convert string in to UPPERCASE==== ");
		System.out.println("the uppercase is "+s.toUpperCase());
		
		System.out.println("==convert into lowercase===");
		System.out.println("the lowercase is "+s.toLowerCase());
		
		System.out.println("===char at specific index==");
		System.out.println("The character at 4th index is "+s.charAt(4));
		
		System.out.println("====index of specific character====");
		System.out.println("The index of i is "+s.indexOf("i"));
		
		System.out.println("===last index of character===");
		System.out.println("The last index of i is "+s1.lastIndexOf("i"));
		
		System.out.println("===TRIM===");
		System.out.println("String s2 before triming "+s2);
		System.out.println("String s2 after triming "+s2.trim());
		
		
		
		
	}

}
