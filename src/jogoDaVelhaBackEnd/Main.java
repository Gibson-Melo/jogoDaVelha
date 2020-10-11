package jogoDaVelhaBackEnd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int posicao, jogador = 1;

		Metodos met = new Metodos();

		System.out.println("---------------------------------");
		System.out.print("INFORME SEU NOME: ");
		met.setNome(sc.nextLine());
		System.out.println("---------------------------------");
		System.out.println("------  S   T   A   R   T  ------");
		System.out.println("---------------------------------");
		met.inicio();
		do {
			jogador += 1;
			System.out.print("INFORME A CASA QUE QUER OCUPAR: ");
			posicao = sc.nextInt();
			met.play1(posicao);
			met.setJogador(jogador);
			met.verificarGanhador();
			if(met.isVerificador() != true){
			met.verificarEmpate();
			}
			met.random();
			if (met.isVerificador() != true) {
				jogador += 1;
				met.setJogador(jogador);
				met.verificarGanhador();
				met.verificarEmpate();
			}
			met.exibir();
		} while (met.isVerificador() == false);
		System.out.println("==================================");
	}
}
