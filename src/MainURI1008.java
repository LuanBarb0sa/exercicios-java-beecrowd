import java.util.Locale;
import java.util.Scanner;


public class MainURI1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		double c = sc.nextDouble();
		
		System.out.println("NUMBER = " + a);
		System.out.printf("SALARY = U$ " +"%.2f\n", +  c * b );
		
		
		
		sc.close();

	}

}
