import java.util.Locale;
import java.util.Scanner;

public class MainWhile3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		char resp;
		do {
		System.out.print("Digite a temperatura em Celsius: ");
		double temp = sc.nextDouble();
		double celcius = ((temp *1.8) + 32); 
		System.out.printf("Equivalente em Fahrenheit: %.1f%n", celcius);
		System.out.print("Deseja repetir (s/n) ? ");
		resp = sc.next().charAt(0);
		}while (resp != 'n');
		
		System.out.println("Obrigado por testar! ");
		sc.close(); 
	}

}
