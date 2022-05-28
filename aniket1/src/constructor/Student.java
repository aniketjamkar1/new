package constructor;

public class Student {
	
	int rollno;
	String sname;
	char grade;
	
	
//	//by using method for approach 2 in main
//	public void getstudentdetails(int rn,String sn,char ch) {
//		rollno=rn;
//		sname=sn;
//		grade=ch;
//	}
//	
	//by using constructor for approach 3 in main 
		Student(int rn,String sn,char ch){
			rollno=rn;
			sname=sn;
			grade=ch;
			
		}
	    
	//to print values
	public void display() {
		System.out.println("The student rollno is "+rollno);
		System.out.println("The student name is "+sname);
		System.out.println("The student grade is "+grade);
		
		
		
	}
}
