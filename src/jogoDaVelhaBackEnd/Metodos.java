package jogoDaVelhaBackEnd;

import java.util.Random;
import java.util.Scanner;

public class Metodos {

	private int valor, jogador;
	private String X_ou_O, nome;
	private boolean ocupado, verificador;
	String mat[][] = new String[3][3];

	private int getValor() {
		return valor;
	}

	private void setValor(int valor) {
		this.valor = valor;
	}

	public int getJogador() {
		return jogador;
	}

	public void setJogador(int jogador) {
		this.jogador = jogador;
	}

	public boolean isVerificador() {
		return verificador;
	}

	private void setVerificador(boolean verificador) {
		this.verificador = verificador;
	}

	private String getX_ou_O() {
		return X_ou_O;
	}

	private void setX_ou_O(String x_ou_O) {
		X_ou_O = x_ou_O;
	}

	private String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public void inicio() {
		mat[0][0] = "[1]";
		mat[0][1] = "[2]";
		mat[0][2] = "[3]";
		mat[1][0] = "[4]";
		mat[1][1] = "[5]";
		mat[1][2] = "[6]";
		mat[2][0] = "[7]";
		mat[2][1] = "[8]";
		mat[2][2] = "[9]";

		this.exibir();
	}

	public void play1(int posicao) {
		this.setValor(posicao);
		this.setX_ou_O(" X ");
		this.converter();
		if (this.isOcupado() == true) {
			while (this.isOcupado() == true) {
				System.out.print("CASA OCUPADA. ESCOLHA OUTRA: ");
				Scanner sc = new Scanner(System.in);
				this.setValor(sc.nextInt());
				this.converter();
			}
		}
	}

	public void random() {
		Random rand = new Random();
		if(mat[0][1] == " O " && mat[0][2] == " O " && mat[0][0] == "[1]" || mat[1][0] == " O " && mat[2][0] == " O " && mat[0][0] == "[1]" || mat[1][1] == " O " && mat[2][2] == " O " && mat[0][0] == "[1]" ){
			mat[0][0] = " O ";
		}else if(mat[0][0] == " O " && mat[0][2] == " O " && mat[0][1] == "[2]" || mat[1][1] == " O " && mat[2][1] == " O " && mat[0][1] == "[2]"){
			mat[0][1] = " O ";
		}else if(mat[0][0] == " O " && mat[0][1] == " O " && mat[0][2] == "[3]" || mat[1][2] == " O " && mat[2][2] == " O " && mat[0][2] == "[3]" || mat[2][0] == " O " && mat[1][1] == " O " && mat[0][2] == "[3]"){
			mat[0][2] = " O ";
		}else if(mat[0][0] == " O " && mat[2][0] == " O " && mat[1][0] == "[4]" || mat[1][1] == " O " && mat[1][2] == " O " && mat[1][0] == "[4]"){
			mat[1][0] = " O ";
		}else if(mat[1][0] == " O " && mat[1][2] == " O " && mat[1][1] == "[5]" || mat[0][1] == " O " && mat[2][1] == " O " && mat[1][1] == "[5]" || mat[0][2] == " O " && mat[2][0] == " O " && mat[1][1] == "[5]" || mat[0][0] == " O " && mat[2][2] == " O " && mat[1][1] == "[5]"){
			mat[1][1] = " O ";
		}else if(mat[0][2] == " O " && mat[2][2] == " O " && mat[1][2] == "[6]" || mat[1][0] == " O " && mat[1][1] == " O " && mat[1][2] == "[6]"){
			mat[1][2] = " O ";
		}else if(mat[0][0] == " O " && mat[1][0] == " O " && mat[2][0] == "[7]" || mat[2][1] == " O " && mat[2][2] == " O " && mat[2][0] == "[7]" || mat[1][1] == " O " && mat[0][2] == " O " && mat[2][0] == "[7]"){
			mat[2][0] = " O ";
		}else if(mat[0][1] == " O " && mat[1][1] == " O " && mat[2][1] == "[8]" || mat[2][0] == " O " && mat[2][2] == " O " && mat[2][1] == "[8]"){
			mat[2][1] = " O ";
		}else if(mat[0][2] == " O " && mat[1][2] == " O " && mat[2][2] == "[9]" || mat[2][0] == " O " && mat[2][1] == " O " && mat[2][2] == "[9]" || mat[0][0] == " O " && mat[1][1] == " O " && mat[2][2] == "[9]"){
			mat[2][2] = " O ";
		}else{
		this.setValor(rand.nextInt(9) + 1);
		this.setX_ou_O(" O ");
		this.converter();
		}
		if (this.isOcupado() == true) {
			while (this.isOcupado() == true) {
				this.setValor(rand.nextInt(9) + 1);
				this.converter();
			}
		}

	}

	private void converter() {
		switch (this.getValor()) {
		case 1: {
			if (mat[0][0] == " X " || mat[0][0] == " O ") {
				this.setOcupado(true);
				break;
			} else {
				this.setOcupado(false);
				mat[0][0] = this.getX_ou_O();
				break;
			}
		}
		case 2: {
			if (mat[0][1] == " X " || mat[0][1] == " O ") {
				this.setOcupado(true);
				break;
			} else {
				this.setOcupado(false);
				mat[0][1] = this.getX_ou_O();
				break;
			}
		}
		case 3: {
			if (mat[0][2] == " X " || mat[0][2] == " O ") {
				this.setOcupado(true);
				break;
			} else {
				this.setOcupado(false);
				mat[0][2] = this.getX_ou_O();
				break;
			}
		}
		case 4: {
			if (mat[1][0] == " X " || mat[1][0] == " O ") {
				this.setOcupado(true);
				break;
			} else {
				this.setOcupado(false);
				mat[1][0] = this.getX_ou_O();
				break;
			}
		}
		case 5: {
			if (mat[1][1] == " X " || mat[1][1] == " O ") {
				this.setOcupado(true);
				break;
			} else {
				this.setOcupado(false);
				mat[1][1] = this.getX_ou_O();
				break;
			}
		}
		case 6: {
			if (mat[1][2] == " X " || mat[1][2] == " O ") {
				this.setOcupado(true);
				break;
			} else {
				this.setOcupado(false);
				mat[1][2] = this.getX_ou_O();
				break;
			}
		}
		case 7: {
			if (mat[2][0] == " X " || mat[2][0] == " O ") {
				this.setOcupado(true);
				break;
			} else {
				this.setOcupado(false);
				mat[2][0] = this.getX_ou_O();
				break;
			}
		}
		case 8: {
			if (mat[2][1] == " X " || mat[2][1] == " O ") {
				this.setOcupado(true);
				break;
			} else {
				this.setOcupado(false);
				mat[2][1] = this.getX_ou_O();
				break;
			}
		}
		case 9: {
			if (mat[2][2] == " X " || mat[2][2] == " O ") {
				this.setOcupado(true);
				break;
			} else {
				this.setOcupado(false);
				mat[2][2] = this.getX_ou_O();
				break;
			}
		}

		}

	}

	public void exibir() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mat[i][j] + "   ");
			}
			System.out.println(" ");
		}
	}

	public String toString() {

		if (this.getJogador() % 2 == 0) {
			this.setNome(this.getNome());
		} else {
			this.setNome("MÁQUINA");
		}
		return " PARABÉNS >( " + this.getNome()
				+ " )< VOCÊ VENCEU!\n==================================";
	}

	public void verificarGanhador() {
		if (mat[0][0] == mat[0][1] && mat[0][1] == mat[0][2]
				|| mat[0][0] == mat[1][0] && mat[1][0] == mat[2][0]
				|| mat[1][0] == mat[1][1] && mat[1][1] == mat[1][2]
				|| mat[0][1] == mat[1][1] && mat[1][1] == mat[2][1]
				|| mat[2][0] == mat[2][1] && mat[2][1] == mat[2][2]
				|| mat[0][2] == mat[1][2] && mat[1][2] == mat[2][2]
				|| mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2]
				|| mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0]) {
			this.setVerificador(true);
			System.out.println("==================================");
			System.out.println("       F I M   D O   J O G O      ");
			System.out.println("==================================");
			System.out.println(this.toString());
		}
	}

	public void verificarEmpate() {
		if (mat[0][0] != "[1]" && mat[0][1] != "[2]" && mat[0][2] != "[3]"
				&& mat[1][0] != "[4]" && mat[1][1] != "[5]"
				&& mat[1][2] != "[6]" && mat[2][0] != "[7]"
				&& mat[2][1] != "[8]" && mat[2][2] != "[9]") {
			System.out.println("==================================");
			System.out.println("       F I M   D O   J O G O      ");
			System.out.println("==================================");
			System.out.println("       D E U    E M P A T E       ");
			System.out.println("==================================");
			this.setVerificador(true);
			//System.out.println(this.isVerificador());
		}
	}
}
