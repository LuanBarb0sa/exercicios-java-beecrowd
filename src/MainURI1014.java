import java.util.Locale;
import java.util.Scanner;

public class MainURI1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		double y = sc.nextDouble();
		double media = x/y;

		System.out.println(String.format("%.3f km/l", media));

	}

}
