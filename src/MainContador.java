import java.util.Scanner;

public class MainContador {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int indice, soma, k;
	
	indice = 6;
	soma = 0;
	k = 0;
	
	while (k < indice) {
		k = k + 1;
		soma = soma + k;
		System.out.println(k);
	}
	
	System.out.println(soma);
	
	
	
	sc.close();
	}

}
