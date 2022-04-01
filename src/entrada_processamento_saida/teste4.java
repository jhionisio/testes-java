package entrada_processamento_saida;

import java.util.Scanner;

public class teste4{
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int soma, media, a, b, c, d;
		
		System.out.printf("Digite o primeiro valor a ser calculado: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo valor a ser calculado: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o terceiro valor a ser calculado: ");
		c = ler.nextInt();
		
		System.out.printf("E digite o quarto e último valor: ");
		d = ler.nextInt();
		
		soma = a + b + c + d;
		media = soma / d;
		
		System.out.printf("O resultado da média atirmética simples é: %d", media);
		
	}
}