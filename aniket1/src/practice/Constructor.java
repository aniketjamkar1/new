package practice;

public class Constructor {
	
	int rollno ;
	String name ;
	int marks;
	// zero argument
	Constructor (){
		System.out.println("This is zero argument constructor");
		rollno = 11;
		name="gvsgdvgusuu";
		marks=75;
		
	}
	Constructor (int r,String s,int m){
		System.out.println("This is one argument constructor");
		rollno=r;
		name=s;
		marks=m;
	}
	
	 public void test() {
		 System.out.println(rollno);
		 System.out.println(name);
		 System.out.println("marks");
	 }
	
	 public static void main(String[] args) {
		 Constructor c= new Constructor();
		 c.test();
		 Constructor g = new Constructor(125,"vduhhg", 60);
		g.test();
		 
	}
	
	

}
