package loopStetement;

public class Forloop {

	public static void main(String[] args) {
	
		 System.out.println("=====write 1 to 50 number=====");
		 
		  for(int i=1;i<=25;i++){
			  System.out.println(i);
		  }
	     System.out.println("====Print 1 to 25 number decending====");
	     
	     for(int i=25;i>=1;i--) {
	    	 System.out.println(i);
	     }
	     
	     System.out.println("====Create Table====");
	     
	     int num = 6;
	     for(int i=1;i<=10;i++) {
	    	 System.out.println(num+"*"+i+" = "+num*i);
	     }
	     
	     System.out.println("===print A to Z====");
	     
	     for(char c='A';c<='z';c++) {
	    	 System.out.print(c+" ");
	     }
	}
}
