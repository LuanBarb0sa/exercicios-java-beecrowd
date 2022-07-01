import java.util.Locale;
import java.util.Scanner;

public class MainURI1046 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int horaInicio = sc.nextInt();
		int horaFim = sc.nextInt();
		int duracao;
		
		if (horaInicio < horaFim) {
			duracao = horaFim - horaInicio;
		}
		else {
			duracao = 24 - horaInicio + horaFim;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		

		
		sc.close();
	}

}
