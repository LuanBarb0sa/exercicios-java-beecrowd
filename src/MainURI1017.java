import java.util.Locale;
import java.util.Scanner;

public class MainURI1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int autonomia = 12;
		double horas = sc.nextDouble();
		double velocidade = sc.nextDouble();
		double gasto = (horas * velocidade) / autonomia;
		System.out.printf("%.3f\n", gasto);
		
		
		sc.close();
	}

}
