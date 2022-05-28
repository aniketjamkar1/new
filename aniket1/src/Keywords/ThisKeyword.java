package Keywords;

public class ThisKeyword {
	
	int x;
	int y;
	
	int a=10;
	public void test() {
		int a=20;     // we get a= 20 becoz a=20 is new
		System.out.println(a);
		System.out.println(this.a); //this call to global a=10
	}
	public void testa() {
		int a=30;
		System.out.println(a);
		System.out.println(this.a);
	}
	
	public void sum(int x,int y) {  //accept parameter will not return anything
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}//this keyword is also uesd as seprenseator as between class variabal and local variabals 
	
	public static void main(String[] args) {
		
		ThisKeyword th = new ThisKeyword();
		th.test();
		th.testa();
		th.sum(50, 20);
		
	}

}
