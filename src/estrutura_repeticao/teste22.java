package estrutura_repeticao;

import java.util.Scanner;

public class teste22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, nm;
		
		System.out.printf("Digite um número: ");
		n = ler.nextInt();
		
		System.out.printf("Digite um número: ");
		nm = ler.nextInt();
		
		while (nm <= n) {
			System.out.printf("Erro, número negativo! Digite um número maior do que o primeiro: ");
            nm = ler.nextInt();
		}

	}

}
