import java.util.Locale;
import java.util.Scanner;

public class MainURI1035 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

		int A, B, C, D, E, F;
		
		 A = sc.nextInt();
		 B = sc.nextInt();
		 C = sc.nextInt();
		 D = sc.nextInt();
		 
		 E = C + D;
		 F = A + B;
		 
		 if (B > C && D > A && E > F && C > 0 && D > 0 && A % 2 == 0) {
			 System.out.println("Valores aceitos");
		 }
		 else {
			 System.out.println("Valores nao aceitos");
		 }
		
	sc.close();
	
	}

}
