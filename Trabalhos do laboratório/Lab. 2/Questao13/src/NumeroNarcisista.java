import java.util.Scanner;

public class NumeroNarcisista {

	public static int somador(int n){    
        int soma = 0;
        int m = n;
        int contador = 0;
        
        int i = n;
        while (i != 0){
            soma =  (int) (soma + ( Math.pow(i % 10, 3)));
            i = i/10;
            contador = contador + 1;
            //System.out.printf("contador: %d\n", contador);
        }
        
        soma = 0;
        while (n != 0)
        {
        	//System.out.printf("numero que vai ser elevado: %d\n",  n%10);
        	//System.out.printf("somado com: %f\n",  Math.pow(n % 10, contador) );
            soma =  (int) (soma + ( Math.pow(n % 10, contador)));
            n = n/10;
            //System.out.printf("soma: %d\n", soma);
            //System.out.printf("n: %d\n", n);
        }
        
        if(soma == m) {
        	System.out.println("SIM");
        	//System.out.printf("%d e %d\n", soma, m);
        }else {
        	System.out.println("NAO");
        	//System.out.printf("%d e %d\n", soma, m);
        }
        //System.out.printf("somafinal: %d\n", soma);
        
      
    return soma;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		somador(n);
		

	}

}
