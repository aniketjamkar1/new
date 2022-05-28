package objectMethod;

public class ExampleMain {

	public static void main(String[] args) {
                                              //object creation example class
		        Example emp1=new Example();
		        
		        emp1.empid=125;
		        emp1.empname="ABCD";
		        emp1.empsal=22500.55;
		        emp1.empdept=04;
		        emp1.empjob="Devloper";
		        emp1.display();
		   
		        System.out.println("=============================");
		        
		        Example emp2=new Example();
		        emp2.empid=189;
		        emp2.empname="XYXZZ";
		        emp2.empsal=17589.59;
		        emp2.empdept=17;
		        emp2.empjob="Tester";
		        emp2.display();
		   
		        
		        
		
		
	}

}
