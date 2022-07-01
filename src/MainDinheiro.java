import java.util.Locale;
import java.util.Scanner;

public class MainDinheiro {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a quantia que deseja gastar: ");
		double dinheiro = sc.nextDouble();
		if (dinheiro >= 10000) {
			System.out.println("Partiu Madrid");
		}
		else if (dinheiro >= 5000 && dinheiro < 10000) {
			System.out.println("Visitar família");
		}
		else {
			System.out.println("#Puto");
		}
		sc.close();
	}

}
