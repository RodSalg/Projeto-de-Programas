import java.util.Scanner;

public class Xadrez {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int  quantidade = scan.nextInt();
		
		
		for(int i = 0; i < quantidade; i++) {
			
			
			
			if(i % 2 == 0) {
				for(int j = 0; j < quantidade; j++) {
					System.out.printf("* ");
				}
			}else {
				for(int j = 0; j < quantidade; j++) {
					System.out.printf(" *");
				}
			}
			
			System.out.println();


			
		}

	}

}
