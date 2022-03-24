package teste1;

import java.util.Scanner;

public class teste13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double v1, v2, v3;
		
		System.out.printf("Digite o valor: ");
		v1 = ler.nextInt();
		
		System.out.printf("Digite o valor: ");
		v2 = ler.nextInt();
		
		System.out.printf("Digite o valor: ");
		v3 = ler.nextInt();
		
		if(v1 > v2) {
			if(v1 > v3) {
				System.out.printf("O maior é: %.2f", v1);
			} else {
				System.out.printf("O maior é: %.2f", v3);
			}
		} else {
			if(v2 > v3) {
				System.out.printf("O maior é: %.2f", v2);
			} else {
				System.out.printf("O maior é: %.2f", v3);
			}
		}
	}
}
