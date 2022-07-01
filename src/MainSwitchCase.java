import java.util.Locale;
import java.util.Scanner;

public class MainSwitchCase {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("*************************");
		System.out.println("****CRIANÇA ESPERANÇA****");
		System.out.println("*************************");
		System.out.println("MUITO OBRIGADO POR AJUDAR");
		System.out.println("[1] para doar R$10");
		System.out.println("[2] para doar R$25");
		System.out.println("[3] para doar R$50");
		System.out.println("[4] para doar outros valores");
		System.out.println("[5] para cancelar");
		System.out.println();
		int x = sc.nextInt();
		double valor = 0;
		
		switch (x) {
		case 1:
			valor = 10;
			break;
		case 2:
			valor = 25;
			break;
		case 3:
			valor = 50;
			break;
		case 4: 
			System.out.println("Digite o valor que deseja doar: ");
			valor = sc.nextDouble();
			break;
		case 5:
			System.out.println("Você cancelou a operação.");
			break;
		}
		System.out.println("Obrigado, você acabou de doar: "  + valor);

	}

}
