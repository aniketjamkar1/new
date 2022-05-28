package Inheritance;

public class Herarchical {
	
	public static void main(String[] args) {
		
		LoanDept ld=new LoanDept();
		//ld.loan();
	
		GoldLoan gl=new GoldLoan();
		gl.Gold();
		
		HomeLoan hl=new HomeLoan();
		hl.home();
		
		PersonalLoanDept plDept=new PersonalLoanDept();
		plDept.personal();
		plDept.loan();
	}

}
