package estrutura_repeticao;

import java.util.Scanner;

public class teste21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n;
		
		System.out.printf("Digite o n�mero: ");
		n = ler.nextInt();
		
		while (n <= 0) {
			System.out.printf("Erro, n�mero negativo! Digite um n�mero positivo: ");
            n = ler.nextInt();
		}

	}
}
