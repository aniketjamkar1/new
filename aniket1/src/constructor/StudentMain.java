package constructor;

public class StudentMain {

	public static void main(String[] args) {
		
		//Initializing by object
		//approach 1
		
//	Student s1 = new Student();
//		s1.rollno=125;
//		s1.sname="abcd";
//		s1.grade='B';
//		s1.display();
//
//
//	//	Approch 2
//			System.out.println("=========================");
//			Student s2 = new Student();
//			s2.getstudentdetails(102, "werx", 'a');
//			s2.display();
			
		//Approch 3
		Student s3=new Student(105,"XXYYZZ",'B');
		s3.display();
				
		
	}

}
