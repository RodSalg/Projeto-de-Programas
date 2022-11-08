import java.util.Scanner;

public class VolumeCombustivel {
	
	public static double SphereVolume(double r) {
		double total;
		double a = (4);
		double b = Math.PI;
		double c = (r*r*r);
		total = (4 * b* c)/3;
		//System.out.printf("%.4f", total);
		return total;
	}
	
	public static double sphericalCapVol(double r, double x) {
		double total2;
		double a = (Math.PI / 3);
		double b = (x*x);
		double c = (3*r - x);
		
		total2 = a * b * c;
		
		return total2;
	}
	
	public static double airVol(double r, double x) {
		
		double total3 = (SphereVolume(r) - sphericalCapVol(r, x));
		
		
		return total3;
	}
	
	public static void VolumeCilindro (double r, double x) {
		
		double v = Math.PI * ((r * r) * x);
		System.out.printf("%f\n", v);
	
	}
	
	public static void program (){
		Scanner scan = new Scanner(System.in);
		double H = scan.nextDouble();
		double h = scan.nextDouble();
		double r = scan.nextDouble();
		double x = h - H;
		//double H = 90;
		//double x = 40;
		//double r = 10;
		//int choice = scan.nextInt();
		
		//VolumeCilindro(r, x);
		//System.out.printf("%.3f\n", sphericalCapVol(r, x) ); //ok
			
	    //System.out.printf("%.4f\n", airVol(r, x));    
	    //System.out.printf("\n volume do combustivel: %f", fim);		
		double vol;
		if((2*r > H) || (h > H)) {
			System.out.println("-1.000");
		}else if(h >= r) {
			double a = 2.0/3.0;
			vol = (a * Math.PI * (r*r*r) + Math.PI * (r*r) * (h - r)  );	
			System.out.printf("%.3f\n", vol); 
		}else {
			//System.out.println("caso 3");
			System.out.printf("%.3f\n", sphericalCapVol(r, h)); 
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		program();

	}

}
