import java.util.Scanner;

public class SomaDigitos {
	
	public static int somador(int n)
    {    
        int soma = 0;
          
        while (n != 0)
        {
            soma = soma + n % 10;
            n = n/10;
        }
      
    return soma;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		int unidade = numero % 10;
		int dezena = (numero % 100) / 10;
		int centena1 = (numero / 100) /10 ;
		int centena2 = (numero/100) % 10;
		
		//fiz de um jeito preguiçoso 	 
		
		//enquanto o numero for maior que 10 eu vou somando 
		
		//while((numero / 10)) {
			
			int totalFinal = somador(numero);
			System.out.printf("%d", totalFinal);
		}
		
		//int total = unidade + dezena + centena1 + centena2;
		
		
	;
		
		
		//achando o resto e fazendo uam soma
		
	}

