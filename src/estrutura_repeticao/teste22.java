package estrutura_repeticao;

import java.util.Scanner;

public class teste22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, nm;
		
		System.out.printf("Digite um n�mero: ");
		n = ler.nextInt();
		
		System.out.printf("Digite um n�mero: ");
		nm = ler.nextInt();
		
		while (nm <= n) {
			System.out.printf("Erro, n�mero negativo! Digite um n�mero maior do que o primeiro: ");
            nm = ler.nextInt();
		}

	}

}
