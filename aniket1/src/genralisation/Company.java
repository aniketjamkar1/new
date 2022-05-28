package genralisation;

public class Company {

	public static void main(String[] args) {
		idea i= new idea();
		i.calling();
		i.sms();
		i.internet();
		System.out.println("==================");
		
		JIo j = new JIo();
		j.calling();
		j.sms();
		j.internet();
		j.amazon();
		System.out.println("==================");
		
        Airtel a = new Airtel();
        a.calling();
        a.sms();
        a.internet();            // genralisation is nothing but similar to interface
	}

}
