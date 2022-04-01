package estrutura_repeticao;

import java.util.Scanner;

public class teste21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n;
		
		System.out.printf("Digite o número: ");
		n = ler.nextInt();
		
		while (n <= 0) {
			System.out.printf("Erro, número negativo! Digite um número positivo: ");
            n = ler.nextInt();
		}

	}
}
