package estrutura_repeticao;

import java.util.Scanner;

public class teste23 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String g;
		
		System.out.printf("Especifique um g�nero com as siglas, M ou F: ");
		g = ler.toString();
		

		while (g != "M" && g != "F") {
			System.out.printf("Especifique um g�nero com as siglas, M ou F. TA FALANDO OQ � PRA FAZER S� FAZ: ");
			g = ler.toString();
		}

	}

}
