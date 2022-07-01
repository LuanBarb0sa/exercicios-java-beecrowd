import java.util.Locale;
import java.util.Scanner;

public class MainEmprestimo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("_____Adriano Muralha_____");
		System.out.println();
		System.out.print("Primeira nota: ");
		double primeira_nota = sc.nextDouble();
		System.out.print("Segunda nota: ");
		double segunda_nota = sc.nextDouble();
		System.out.println();
		double media = ((primeira_nota + segunda_nota) / 2);
		if (media > 9 && media <= 10) {
			System.out.println("ALUNO APROVADO"+ media);
			System.out.println("CLASSIFICA플O: A");
		}
		else if (media > 7 && media <= 8) {
			System.out.println("ALUNO APROVADO"+ media);
			System.out.println("CLASSIFICA플O: B");
		}
		else if (media > 5 && media <= 6) {
			System.out.println("ALUNO EM RECUPERA플O: "+ media);
			System.out.println("CLASSIFICA플O: C");
		}
		else if (media > 3 && media <= 4) {
			System.out.println("ALUNO EM RECUPERA플O: "+ media);
			System.out.println("CLASSIFICA플O: D");
		}
		else if (media > 1 && media <=2) {
			System.out.println("ALUNO NA FINAL: "+ media);
			System.out.println("CLASSIFICA플O: E");
		}
		else {
			System.out.println("ALUNO BURRO: "+ media);
			System.out.println("CLASSIFICA플O: F");
		}
		sc.close();
		}
}
