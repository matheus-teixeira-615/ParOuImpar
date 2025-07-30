package parOuImpar;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("digite um numero para saber se é par ou ímpar: ");
		int numeroEscolhido = scanner.nextInt();
		
		
		if (numeroEscolhido % 2 == 0) {
			System.out.print("O numero " + numeroEscolhido + " é par. ");
		}
		else if (numeroEscolhido % 2 != 0) {
			System.out.println("O número " + numeroEscolhido + " é ímpar.");
		}
		else {
			System.out.println("Algo deu errado");
		}
		scanner.close();
	}

}
