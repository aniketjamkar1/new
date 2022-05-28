package patternProgram;

public class Ex4 {

	public static void main(String[] args) {
		
		  for(int i=1;i<=5;i++) {
			  for(int j=1;j<=i;j++) {
				  System.out.print("* ");
			  }   System.out.println();              // this loop is upper triangle
		  }
		   for(int i=1;i<=5;i++) {
			   for(int j=4;j>=i;j--) {
				   System.out.print("* ");
			   }System.out.println();
		   }
		
		
		
	}

}
