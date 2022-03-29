package teste1;

import java.util.Scanner;

public class teste20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2;
		
		System.out.printf("Digite sua nota da P1:");
		p1 = ler.nextDouble();
		
		p2 = (15 - p1) / 2;
		
		System.out.printf("O aluno precisa de %.2f ou mais na P2, para não reprovar", p2);
	}

}
