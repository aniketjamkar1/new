package String;

public class SringComparision {

	public static void main(String[] args) {
		
		String s="Velocity";
		String s1="VELOCITY";
		String s2="Veloc";
		
		  System.out.println("===equal===");
		  System.out.println(s.equals(s1));
		  
		  System.out.println("===equalsingignorcase===");
		  System.out.println(s1.equalsIgnoreCase(s));
		  
		  System.out.println("===contains===");
		  System.out.println(s.contains(s2));
		
		  System.out.println("==chek emptyness==");
		  System.out.println(s.isEmpty());
		
		  
		  String s3="abcd";
		  String s4="wxyz";
		  
		  System.out.println("==join two strings==");
		  System.out.println(s3.concat(s4));
		  
		  System.out.println("===start with==");
		  System.out.println("the start with method "+s2.startsWith("ab"));
		  
		  System.out.println("The end with method "+s4.endsWith("yz"));
		   
		   String s5="Welcome to java";
				   
		  System.out.println("===replace===");
		  System.out.println("ORIGINAL "+s5);
		  System.out.println("Replace "+s5.replace("java", "Python"));
		  
		  System.out.println("====substring====");
		  System.out.println("the substring stsrtwith index only "+s.substring(3));
		  System.out.println("The substring with start and end index "+s.substring(3, 6));
	}

}
