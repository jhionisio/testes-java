package teste7;

import java.util.Scanner;

public class teste7{
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double troco, pago, valor, a, b, c, d, e;
		
		System.out.printf("Digite o valor do produto: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o valor do produto: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o valor do produto: ");
		c = ler.nextInt();
		
		System.out.printf("Digite o valor do produto: ");
		d = ler.nextInt();
		
		System.out.printf("Digite o valor do produto: ");
		e = ler.nextInt();
		
		valor = a + b + c + d + e;
		
		System.out.printf("Valor a ser cobrado: %.2f", valor);
				
		
		System.out.printf("Digite o valor pago pelos produtos: ");
		pago = ler.nextInt();
		
		troco = valor - pago;
		
		System.out.printf("Troco do cliente: %.2f", troco);
		
	}
}