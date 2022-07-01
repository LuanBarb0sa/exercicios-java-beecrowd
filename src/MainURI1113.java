import java.util.Scanner;

public class MainURI1113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		while (X != Y) {
			if (X < Y) {
				System.out.println("CRESCENTE");
			} else {
				System.out.println("DECRESCENTE");
			}
			
			X = sc.nextInt();
			Y = sc.nextInt();

			
		}
		sc.close();
	}
}
