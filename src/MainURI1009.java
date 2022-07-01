import java.util.Locale;
import java.util.Scanner;

public class MainURI1009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		
		double A, B, C;
		String name;
		
		
		name = sc.next();
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		
		System.out.printf("TOTAL = R$ " + "%.2f\n", + ( A + (B * 0.15)));
		

	}

}
