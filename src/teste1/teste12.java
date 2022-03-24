package teste1;

import java.util.Scanner;

public class teste12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.printf("Digite a base: ");
		base = ler.nextInt();
		
		System.out.printf("Digitea altura: ");
		altura = ler.nextInt();
		
		area = base * altura;
		
		if(area > 100) {
			System.out.printf("Que terreno grande, hein amigão.");
		}
		else {
			System.out.printf("Que terreno pequenininho, hein amigão.");
		}
	}

}
