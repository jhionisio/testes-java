package teste2;

import java.util.Scanner;

public class teste2{
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int aresta, area;
		
		System.out.printf("Digite a aresta do quadrado a ser calculado: ");
		aresta = ler.nextInt();
		
		area = aresta * 4;
		
		System.out.printf("A area total deste quadrado é %d", area);
		
	}
}