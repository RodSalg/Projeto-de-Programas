import java.util.Scanner;

public class AngryBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		double v0 = scan.nextDouble();
		double alfa = scan.nextDouble();
		double d = scan.nextDouble();
		double g = 9.8;
		alfa = Math.toRadians(alfa);
		//System.out.printf("%f\n\n\n",alfa);
		if(v0 < 0) {
			v0 = v0 * (-1);
		}
		double r = ( (v0 * v0) * Math.sin(2 * alfa)) / g; 
		
		

		if((r - d > 0.1) || (r - d < -0.1)) {
			//System.out.printf("r = %f e  d = %f\n", r, d);
			System.out.println("0");
		}else{
			//System.out.printf("r = %f e  d = %f\n", r, d);
			System.out.println("1");

		}

	}
	
}
