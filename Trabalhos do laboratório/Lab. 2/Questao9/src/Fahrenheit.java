import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double  C = scan.nextDouble();
		double f;
		
		f = ((9*C)/5) + 32;
		
		System.out.printf("%.1f",f);
	}

}
