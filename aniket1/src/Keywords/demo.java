package Keywords;

public class demo extends SuperKeyword {
	
	int a=20;
	
	public void test() {
		int a =30;
		System.out.println(a);
		
		System.out.println(this.a);	//global variabal same class	
		
		System.out.println(super.a); //it reflact imigiat parent
	}
     
	
	public static void main(String[] args) {
		
	     demo th = new	demo();
	     th.test();
		
	}
	 
}
 