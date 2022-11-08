import java.util.Scanner;

public class AproximacaoSeno {

	public static double fatorial(double n) {
		double total = 1;
		for(double i = n; i > 0; i--) {
			total = total * i;
		}
		
		//System.out.printf("total: %f", total);
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double x = scan.nextDouble();
		double k = scan.nextDouble();
		x = Math.toRadians(x);
		int flag = 0;
		double expoente = 3;
		double total = x ;
		System.out.printf("%.10f\n", total);
		for(int i = 1; i < k; i++) {
			
			//System.out.println(": " + expoente);
			
			if(flag == 0) {
				total = total - (Math.pow(x, expoente)/fatorial(expoente)  );
				flag = 1;
				System.out.printf("%.10f\n", total);
			}else {
				total = total + (Math.pow(x, expoente)/fatorial(expoente) );
				flag = 0;
				System.out.printf("%.10f\n", total);
			}
			
			expoente = expoente + 2;

		}
		
		//System.out.printf("%f ", total);
		
	}

}
