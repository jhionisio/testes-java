package teste1;

import java.util.Scanner;

public class teste3{
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int base, altura, area;
		
		System.out.printf("Digite a altura do retângulo a ser calculado: ");
		altura = ler.nextInt();
		
		System.out.printf("Digite a base do retângulo a ser calculado: ");
		base = ler.nextInt();
		
		area = base * altura;
		
		System.out.printf("A area total deste retângulo é %d", area);
		
	}
}