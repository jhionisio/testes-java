package teste6;

import java.util.Scanner;

public class teste6{
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double reais, c, d;
		
		System.out.printf("Digite o da cota��o do d�lar: ");
		c = ler.nextInt();
		
		System.out.printf("Digite quantos d�lares v�o ser convertidos: ");
		d = ler.nextInt();
		
		reais = d * c;
		
		System.out.printf("Voc� converteu %.2f d�lares em %.2f reais", d, reais);
		
	}
}