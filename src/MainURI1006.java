import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class MainURI1006 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float A, B, C;

		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();

		System.out.printf("MEDIA = %.1f%n", (A * 2 + B * 3 + C * 5) / (10));

		sc.close();
 
    }
 
}