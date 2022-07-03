import java.util.Scanner;

public class MainURI1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valorN = sc.nextInt();
		int em = 0;
		int out = 0;

		for (int i = 0; i < valorN; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				em = em + 1;
			} else {
				out = out + 1;
			}
		}
		System.out.println(em + " in");
		System.out.println(out + " out");

		sc.close();
	}
}
