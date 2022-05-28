package StaticKeyword;

public class Ex1StaticKeyword {
	
	         int empid;
	         String name;
	         static int dept;
	public void display() {
		System.out.println(empid);
		System.out.println(name);
		System.out.println(dept);
	}
	
	public static void main(String[] args) {
		Ex1StaticKeyword sk1= new Ex1StaticKeyword();
		
		sk1.empid=986;
		sk1.name="abc";
		dept=55;
		sk1.display();
		
		
		System.out.println("===============");
		
		Ex1StaticKeyword sk2= new Ex1StaticKeyword();
		
		sk2.empid=457;
		sk2.name="xyz";
		dept=22;
		sk2.display();
		
	}
	

}
