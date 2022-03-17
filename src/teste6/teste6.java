package teste6;

import java.util.Scanner;

public class teste6{
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double reais, c, d;
		
		System.out.printf("Digite o da cotação do dólar: ");
		c = ler.nextInt();
		
		System.out.printf("Digite quantos dólares vão ser convertidos: ");
		d = ler.nextInt();
		
		reais = d * c;
		
		System.out.printf("Você converteu %.2f dólares em %.2f reais", d, reais);
		
	}
}