package polymorphism;

public class Child {
	
	   
    public void main(int a,int b, int c,int d) {
    	System.out.println("Four integer argumented main method "+(a+b+c+d));
    }

 
	
	public static void main(String[] args) {

		   Child cc = new Child();
		   
		   cc.main(45, 22, 12, 14);
  
		   MainMethodOverloading parent = new MainMethodOverloading();
		   parent.main(10, 20, 30);
		
		
		
	}

}
