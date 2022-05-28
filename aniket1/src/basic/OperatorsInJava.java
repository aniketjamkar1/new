package basic;

public class OperatorsInJava {

	public static 
	void main(String[] args) {
		          
		  int a=10;
		  int b=30;
		  
		  System.out.println("===Arithmatic operator====");
		  
		  System.out.println("sum of a and b is "+(a+b));
		  System.out.println("diff of aand b is "+(a-b));
		  System.out.println("multiplication of a and b is "+(a*b));
		  System.out.println("divsion of b and a is "+(b/a));
		  System.out.println("mode div of b and a is "+(b%a));
		  
		  System.out.println("====relational operator=====");
		  
		  System.out.println(a==b);
		  System.out.println(a>b);
		  System.out.println(a<b);
		  System.out.println(a>=b);
		  System.out.println(a<=b);
		  System.out.println(a!=b);
		  
		  System.out.println("====Logical operator====");
		 boolean x=true;
		 boolean y=false;
		 
		  System.out.println(x&&y);
		  System.out.println(x||y);
		  System.out.println(!x);
		  System.out.println(!y);
		  
		  System.out.println("=====incremental/decremental operator");
		  
		  a++;
		  System.out.println(a);
		  b--;
		  System.out.println(b);
	}

}
