package teste1;

import java.util.Scanner;

public class teste14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.printf("Digite a peso: ");
		peso = ler.nextInt();
		
		System.out.printf("Digitea altura: ");
		altura = ler.nextInt();
		
		imc = altura*altura/peso;
		
		if(peso > imc) 
			System.out.printf("Você está gordo hein meu amigo.");
		else 
			System.out.printf("Vá comer sua vareta");
	}

}
