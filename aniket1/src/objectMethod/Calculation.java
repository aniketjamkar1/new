package objectMethod;

public class Calculation {
	
		int x=300;
		int y=100;
	               //case1 method will not accept parameter and will not return any value.
	//	public void sum() {
	//		System.out.println(x+y);
	//	}
		         //case 2 method will not accept parameter but return the value.
		public int sum() {
			return x+y;
		}
		       // case 3 method will accept parameter but return the value.
		public void sum(int x,int y) {
	//	int c=x+y;
	//	return x+y;
		
		}
	public static void main(String[] args) {
		//case 1
		Calculation cal=new Calculation();
		cal.sum();
		
		//case 2
//		Calculation cal=new Calculation();
		int output=cal.sum();
		System.out.println(cal.sum());
		
		//case 3
	//	Calculation cal=new Calculation();
        cal.sum(100,200);
        cal.sum(10, 20);
        cal.sum(40,50);
        
        //case 4
//		Calculation cal=new Calculation();
  //      System.out.println(cal.sum(500,600));
        
		
		
		
		
		
	}
}
        
