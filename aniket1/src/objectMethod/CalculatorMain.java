package objectMethod;

public class CalculatorMain {

	public static void main(String[] args) {
	
		Calculater cal=new Calculater();
		
		System.out.println(cal.getsum(125,656));
        System.out.println(cal.getDifferance(500, 250));
        System.out.println(cal.getmultiplication(25, 50));
        System.out.println(cal.getDivision(2000, 440));
        System.out.println(cal.getsumthree(200, 450, 150));
	}

}
