package entrada_processamento_saida;

import java.util.Scanner;

public class teste1{
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int soma, area, altura, base;
		
		System.out.printf("Digite em ordem a altura e a base do tri�ngulo: ");
		altura = ler.nextInt();
		base = ler.nextInt();
		
		soma = altura * base;
		
		area = soma / 2;
		
		System.out.printf("A area total deste tri�ngulo � %d", area);
		
	}
}