import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int  numero = scan.nextInt();
		
		while(numero != -1) {
			
			if((numero % 2) == 0) {
				
				System.out.println("PAR");
				
			}else if((numero % 2) != 0){
				
				System.out.println("IMPAR");
				
			}
			
			numero = scan.nextInt();
			
		}

	}

}
