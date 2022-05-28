package polymorphism;

public class ConstructorOverloading {
	
	ConstructorOverloading(){
		System.out.println("This is zero argument constructor");
	}
	
	ConstructorOverloading(int a){
		System.out.println("This is one argument constructor "+a);
	}
	
	ConstructorOverloading(int a,int b){
		System.out.println("This is two argument constructor "+(a+b));
	}
	
	ConstructorOverloading(int a, double b){
		System.out.println("This is three argument constructor "+ (a+b));
	}
	
	ConstructorOverloading(double a,double b){
		System.out.println("This is four argument constructor "+(a+b));
	}
	
	ConstructorOverloading(double a,double b,int c){
		System.out.println("This is five argument constructor "+(a+b+c));
	}
	
	    public static void main(String[] args) {
			
	    	ConstructorOverloading co = new ConstructorOverloading();
	    	ConstructorOverloading co1 = new ConstructorOverloading(10);
	    	ConstructorOverloading co2 = new ConstructorOverloading(10,20);
	    	ConstructorOverloading co3 = new ConstructorOverloading(10,15.5);
	    	ConstructorOverloading co4 = new ConstructorOverloading(5.5,5.2);
	    	ConstructorOverloading co5 = new ConstructorOverloading(5.5,5.5,10);
	    	
	    	
	    	
	    	
	    	
		}
	

}
