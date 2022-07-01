import java.util.Scanner;

public class MainURI1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			int soma = i * N;
			System.out.println(i + " x " + N + " = " + soma);
		}
		
		
		
		sc.close();
	}

}
