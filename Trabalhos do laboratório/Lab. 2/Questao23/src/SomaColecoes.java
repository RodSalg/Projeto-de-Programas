import java.util.Scanner;

public class SomaColecoes {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acumulador = 0;
		
		int number = 0;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		
		while(number != -1) {
			
			while(number != -1) {
				sum = sum + number;
				number = scan.nextInt();
			}
			System.out.printf("%d", sum);
			sum = 0;
			number = scan.nextInt();
		}
		
		

	}

}
