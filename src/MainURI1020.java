import java.util.Scanner;

public class MainURI1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int idade = sc.nextInt();
		if (idade >= 365) {
			System.out.println("1 mes(es)");
		}
		
		sc.close();
	}

}
