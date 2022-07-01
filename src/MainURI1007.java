import java.io.IOException;
import java.util.Scanner;

public class MainURI1007 {

	public static void main(String[] args) throws IOException {
		
		
		Scanner sc = new Scanner(System.in);


		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int E = A * B - C * D;
		
		System.out.println(" DIFERENCA = " + E );

		sc.close();

	}

}