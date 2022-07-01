import java.util.Locale;
import java.util.Scanner;

public class MainURI1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner (System.in);
		
		int cod_peca1, cod_peca2, qtd_peca1, qtd_peca2;
		double valor_peca1, valor_peca2, total;
		
		cod_peca1 = input.nextInt();
	    qtd_peca1 = input.nextInt();
	    valor_peca1 = input.nextDouble();
	    cod_peca2 = input.nextInt();
	    qtd_peca2 = input.nextInt();
	    valor_peca2 = input.nextDouble();
	    
	    total = (qtd_peca1 * valor_peca1) + (qtd_peca2 * valor_peca2);
	    
	    System.out.printf("VALOR A PAGAR: R$ " + "%.2f\n", + total);
		
		
		input.close(); /* Scanner para fazer a leitura na mesma linha; */
		
	
		

	}

}
