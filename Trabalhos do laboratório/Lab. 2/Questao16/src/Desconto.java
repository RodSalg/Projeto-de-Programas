import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double valor = scan.nextDouble();
		double porcentagem = 5.0/100.0;
		double valorFinal = 0.0;
		if(valor >= 200) {
			
			valorFinal = (valor - (porcentagem * valor));
			
		}else {

			valorFinal = valor;
			
		}
		
		

		
		System.out.printf("%.2f\n", valorFinal);
	}

}
