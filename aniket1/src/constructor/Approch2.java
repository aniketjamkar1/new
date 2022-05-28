package constructor;

public class Approch2 {
	
	
	      int rollno;
	       String sname;
	        char grade;
			
	        //by using method for approach 2 in main
			public void getstudentdetails(int rnn,String snn,char chn) {
				rollno=rnn;
				sname=snn;
				grade=chn;
			}
			
		public void display() {
			System.out.println("The student rollno is "+rollno);
			System.out.println("The student name is "+sname);
			System.out.println("The student grade is "+grade);
		
		}
		}
