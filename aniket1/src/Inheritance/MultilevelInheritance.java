package Inheritance;

public class MultilevelInheritance {
	
        public static void main(String[] args) {
			
        	Grandson gs=new Grandson();
        	gs.m3();    // original class method  
        	gs.m2();	//parent for grandson
        	gs.m1();    //parent for child
		   
        }	

}
