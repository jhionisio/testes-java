package teste1;

import java.util.Scanner;

public class teste10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double maior, menor;
		
		System.out.printf("Digite o valor: ");
		maior = ler.nextInt();
		
		System.out.printf("Digite o valor: ");
		menor = ler.nextInt();
		if(maior == menor) {
			System.out.printf("os números são iguais");
		} else {
			if(maior > menor) {
				System.out.printf("O maior é: %.2f", maior);
			} else {
				System.out.printf("O maior é: %.2f", menor);
			}
		}
	}
}
